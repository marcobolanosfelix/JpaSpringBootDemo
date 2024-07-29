package com.orm.demo.application.mappers;

import com.orm.demo.domain.entities.PlayerEntity;
import com.orm.demo.domain.models.Player;
import com.orm.demo.shared.IMapper;
import com.orm.demo.shared.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PlayerMapper extends Mapper<Player, PlayerEntity> implements IMapper<Player, PlayerEntity> {
    private final ClubMapper clubMapper;

    public PlayerMapper(ClubMapper clubMapper) {
        this.clubMapper = clubMapper;
    }

    @Override
    public List<Player> toModelList(List<PlayerEntity> entities) {
        List<Player> models = new ArrayList<>();
        for (PlayerEntity entity : entities) {
            models.add( toModel( entity ) );
        }
        return models;
    }

    @Override
    public Player toModel(PlayerEntity entity) {
        Player model = mapperEntityToModel(entity, new Player());
        if (entity.getClub() != null) {
            model.setClub(clubMapper.toModel(entity.getClub()) );
        }
        return model;
    }

    @Override
    public PlayerEntity toEntity(Player model) {
        PlayerEntity entity = mapperModelToEntity(model, new PlayerEntity());
        if (model.getClub() != null) {
            entity.setClub( clubMapper.toEntity( model.getClub() ) );
        }
        return entity;
    }
}
