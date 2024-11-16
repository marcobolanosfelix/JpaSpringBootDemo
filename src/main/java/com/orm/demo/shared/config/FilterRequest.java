package com.orm.demo.shared.config;

import java.io.IOException;

import javax.swing.text.Utilities;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.servlet.HandlerExceptionResolver;

import com.orm.demo.domain.exceptions.RepositoryException;
import com.orm.demo.domain.utils.TransactionService;

import jakarta.annotation.Resource;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class FilterRequest extends OncePerRequestFilter {
  @Resource(name = "getTransactionService")
  private TransactionService transactionservice;

  @Qualifier("handlerExceptionResolver")
  private HandlerExceptionResolver resolver;

  private final HandlerExceptionResolver handlerExceptionResolver;

  public FilterRequest(HandlerExceptionResolver handlerExceptionResolver) {
   this.handlerExceptionResolver = handlerExceptionResolver;
  }

  @Override
  protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response, @NonNull FilterChain filterChain) throws ServletException, IOException {
    try {
      RequestWrapper requestWrapper = new RequestWrapper(request);
      this.transactionservice.startTimeRequest();
      
      filterChain.doFilter(requestWrapper, response);

    } catch (RepositoryException ex) {
      this.transactionservice.setMetaException(ex.getCode(), ex.getMsje(), ex.getMsjeException());

      handlerExceptionResolver.resolveException(request, response, null, ex);
    }
  }

  @Override
  protected boolean shouldNotFilter(@NonNull HttpServletRequest request) {
    return !request.getServletPath().contains("/api/");
  }

}
