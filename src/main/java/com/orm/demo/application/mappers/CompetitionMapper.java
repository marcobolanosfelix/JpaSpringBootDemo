package com.orm.demo.application.mappers;

import com.orm.demo.domain.entities.CompetitionsEntity;
import com.orm.demo.domain.models.Competition;
import com.orm.demo.shared.IMapper;
import com.orm.demo.shared.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CompetitionMapper extends Mapper<Competition, CompetitionsEntity> implements IMapper<Competition, CompetitionsEntity> {
    private final ClubMapper clubMapper;

    public CompetitionMapper(ClubMapper clubMapper) {
        this.clubMapper = clubMapper;
    }

    @Override
    public List<Competition> toModelList(List<CompetitionsEntity> entities) {
        List<Competition> models = new ArrayList<>();
        for (CompetitionsEntity entity : entities) {
            models.add( toModel(entity) );
        }
        return models;
    }

    @Override
    public Competition toModel(CompetitionsEntity entity) {
        Competition model = mapperEntityToModel(entity, new Competition());
        if (entity.getClubs() != null) {
            model.setClubs( clubMapper.toModelList(entity.getClubs()) );
        }
        return model;
    }

    @Override
    public CompetitionsEntity toEntity(Competition model) {
        CompetitionsEntity entity = mapperModelToEntity(model, new CompetitionsEntity());
        if (model.getClubs() != null) {
            entity.setClubs( clubMapper.toEntityList(model.getClubs()) );
        }
        return entity;
    }

}
