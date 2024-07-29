package com.orm.demo.application.services;

import com.orm.demo.application.mappers.CouchMapper;
import com.orm.demo.domain.entities.CouchEntity;
import com.orm.demo.infraestructure.out.repositories.CouchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CouchService {
    private final CouchRepository couchRepository;

    public CouchService(CouchRepository couchRepository) {
        this.couchRepository = couchRepository;
    }

    public List<CouchEntity> getAll() {
        return couchRepository.findAll();
    }

    public CouchEntity save(CouchEntity couchEntity) {
        return couchRepository.save(couchEntity);
    }

}
