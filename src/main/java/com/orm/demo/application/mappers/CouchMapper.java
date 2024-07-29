package com.orm.demo.application.mappers;

import com.orm.demo.domain.entities.CouchEntity;
import com.orm.demo.domain.models.Couch;
import com.orm.demo.shared.IMapper;
import com.orm.demo.shared.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CouchMapper extends Mapper<Couch, CouchEntity> implements IMapper<Couch, CouchEntity> {

    @Override
    public List<Couch> toModelList(List<CouchEntity> entities) {
        List<Couch> models = new ArrayList<>();
        for (CouchEntity entity : entities) {
            models.add( toModel(entity) );
        }
        return models;
    }

    @Override
    public Couch toModel(CouchEntity entity) {
        return mapperEntityToModel(entity, new Couch());
    }

    @Override
    public CouchEntity toEntity(Couch model) {
       return mapperModelToEntity(model, new CouchEntity());
    }

}
