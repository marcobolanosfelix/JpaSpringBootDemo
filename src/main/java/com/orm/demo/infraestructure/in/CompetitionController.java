package com.orm.demo.infraestructure.in;

import com.orm.demo.application.usecases.competition.GetAllCompetitionUsecase;
import com.orm.demo.application.usecases.competition.SaveCompetitionUsecase;
import com.orm.demo.domain.models.Competition;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/competition")
public class CompetitionController {
    private final SaveCompetitionUsecase saveCompetitionUsecase;
    private final GetAllCompetitionUsecase getAllCompetitionUsecase;

    public CompetitionController(SaveCompetitionUsecase saveCompetitionUsecase, GetAllCompetitionUsecase getAllCompetitionUsecase) {
        this.saveCompetitionUsecase = saveCompetitionUsecase;
        this.getAllCompetitionUsecase = getAllCompetitionUsecase;
    }

    @GetMapping
    public ResponseEntity<List<Competition>> getAll() {
        List<Competition> competitions;
        try {
            competitions = getAllCompetitionUsecase.getAll();
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.status(HttpStatus.OK).body(competitions);
    }

    @PostMapping
    public ResponseEntity<Competition> save(@RequestBody Competition competition) {
        try {
            competition = saveCompetitionUsecase.save(competition);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
        return ResponseEntity.status(HttpStatus.CREATED).body(competition);
    }

}
