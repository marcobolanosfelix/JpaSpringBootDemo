package com.orm.demo.application.usecases.player;

import com.orm.demo.application.mappers.PlayerMapper;
import com.orm.demo.application.services.PlayerService;
import com.orm.demo.domain.entities.PlayerEntity;
import com.orm.demo.domain.models.Player;
import org.springframework.stereotype.Service;

@Service
public class SavePlayerUsecase {
    private final PlayerService playerService;
    private final PlayerMapper playerMapper;

    public SavePlayerUsecase(PlayerService playerService, PlayerMapper playerMapper) {
        this.playerService = playerService;
        this.playerMapper = playerMapper;
    }

    public Player save(Player player) {
        PlayerEntity playerEntity = playerMapper.toEntity(player);
        return playerMapper.toModel( playerService.save(playerEntity) );
    }

}
