package com.orm.demo.application.services;

import com.orm.demo.domain.entities.PlayerEntity;
import com.orm.demo.infraestructure.out.repositories.PlayerRepository;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public PlayerEntity save(PlayerEntity playerEntity) {
        return playerRepository.save(playerEntity);
    }

}
