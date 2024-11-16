package com.orm.demo.application.usecases.couch;

import com.orm.demo.application.mappers.CouchMapper;
import com.orm.demo.application.services.CouchService;
import com.orm.demo.domain.models.Couch;
import com.orm.demo.domain.response.Data;
import com.orm.demo.domain.response.Response;
import com.orm.demo.domain.response.couch.CouchResponse;
import com.orm.demo.domain.utils.TransactionService;
import com.orm.demo.shared.utils.Constants;

import jakarta.annotation.Resource;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllCouchUsecase {
    @Resource(name = "getTransactionService")
    private TransactionService transactionService;

    private final CouchService couchService;
    private final CouchMapper couchMapper;

    public GetAllCouchUsecase(CouchService couchService, CouchMapper couchMapper) {
        this.couchService = couchService;
        this.couchMapper = couchMapper;
    }


    public CouchResponse getAll() {
        CouchResponse response = new CouchResponse();

        List<Couch> couches = couchMapper.toModelList(couchService.getAll());
        
        this.transactionService.setMeta(Constants.CODE_SUCCESS, Constants.MSJE_READ_SUCCESS);

        response.setMeta(this.transactionService.getMeta());
        response.setData(couches);

        return response;
    }

}
