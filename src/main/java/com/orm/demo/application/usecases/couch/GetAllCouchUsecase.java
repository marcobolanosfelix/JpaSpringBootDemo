package com.orm.demo.application.usecases.couch;

import com.orm.demo.application.mappers.CouchMapper;
import com.orm.demo.application.services.CouchService;
import com.orm.demo.domain.models.Couch;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllCouchUsecase {
    private final CouchService couchService;
    private final CouchMapper couchMapper;

    public GetAllCouchUsecase(CouchService couchService, CouchMapper couchMapper) {
        this.couchService = couchService;
        this.couchMapper = couchMapper;
    }


    public List<Couch> getAll() {
        return couchMapper.toModelList( couchService.getAll() );
    }

}
