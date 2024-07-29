package com.orm.demo.infraestructure.in;

import com.orm.demo.application.usecases.player.SavePlayerUsecase;
import com.orm.demo.domain.models.Player;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/player")
public class PlayerController {
    private final SavePlayerUsecase savePlayerUsecase;

    public PlayerController(SavePlayerUsecase savePlayerUsecase) {
        this.savePlayerUsecase = savePlayerUsecase;
    }


    @PostMapping
    public ResponseEntity<Player> save(@RequestBody Player player) {
        try {
            player = savePlayerUsecase.save(player);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(player);
    }

}
