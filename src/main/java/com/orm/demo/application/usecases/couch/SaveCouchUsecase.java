package com.orm.demo.application.usecases.couch;

import com.orm.demo.application.mappers.CouchMapper;
import com.orm.demo.application.services.CouchService;
import com.orm.demo.domain.entities.CouchEntity;
import com.orm.demo.domain.models.Couch;
import org.springframework.stereotype.Service;

@Service
public class SaveCouchUsecase {
    private final CouchService couchService;
    private final CouchMapper couchMapper;

    public SaveCouchUsecase(CouchService couchService, CouchMapper couchMapper) {
        this.couchService = couchService;
        this.couchMapper = couchMapper;
    }

    public Couch save(Couch couch) {
        CouchEntity couchEntity = couchMapper.toEntity(couch);
        return couchMapper.toModel( couchService.save(couchEntity) );
    }

}
