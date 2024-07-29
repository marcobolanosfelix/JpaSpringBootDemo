package com.orm.demo.application.mappers;

import com.orm.demo.domain.entities.ClubEntity;
import com.orm.demo.domain.models.Club;
import com.orm.demo.shared.IMapper;
import com.orm.demo.shared.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClubMapper extends Mapper<Club, ClubEntity> implements IMapper<Club, ClubEntity> {
    private final CouchMapper couchMapper;

    public ClubMapper(CouchMapper couchMapper) {
        this.couchMapper = couchMapper;
    }

    @Override
    public List<Club> toModelList(List<ClubEntity> entities) {
        List<Club> models = new ArrayList<>();
        for (ClubEntity entity : entities) {
            models.add( toModel(entity) );
        }
        return models;
    }

    @Override
    public Club toModel(ClubEntity entity) {
        Club model = mapperEntityToModel(entity, new Club());
        if (entity.getCouch() != null) {
            model.setCouch( couchMapper.toModel(entity.getCouch()) );
        }
        return model;
    }

    @Override
    public ClubEntity toEntity(Club model) {
        ClubEntity entity = mapperModelToEntity(model, new ClubEntity());
        if (model.getCouch() != null) {
            entity.setCouch( couchMapper.toEntity(model.getCouch()) );
        }
        return entity;
    }

}
