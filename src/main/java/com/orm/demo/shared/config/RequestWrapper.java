package com.orm.demo.shared.config;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import org.springframework.util.StreamUtils;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import jakarta.servlet.ReadListener;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletRequestWrapper;

public class RequestWrapper extends HttpServletRequestWrapper {
  
  private String bodyRequest;

  public RequestWrapper(HttpServletRequest request) throws IOException {
    super(request);

    Gson gson = new Gson();
    
    JsonObject jsonBody = gson.fromJson(new String(StreamUtils.copyToByteArray(request.getInputStream()), StandardCharsets.UTF_8), JsonObject.class);
    this.bodyRequest = gson.toJson(jsonBody);
  }

  @Override
  public ServletInputStream getInputStream() throws IOException {
    final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.bodyRequest.getBytes());

    return new ServletInputStream() {
      @Override
      public boolean isFinished() {
        return false;
      }

      @Override
      public boolean isReady() {
        return false;
      }

      @Override
      public void setReadListener(ReadListener readListener) {
        // NOTHING
      }

      @Override
      public int read() throws IOException {
        return byteArrayInputStream.read();
      }
      
    };
  }

  @Override
  public BufferedReader getReader() throws IOException {
    return new BufferedReader(new InputStreamReader(this.getInputStream()));
  }

}
