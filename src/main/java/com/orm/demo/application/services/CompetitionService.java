package com.orm.demo.application.services;

import com.orm.demo.domain.entities.CompetitionsEntity;
import com.orm.demo.infraestructure.out.repositories.CompetitionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionService {
    private final CompetitionRepository competitionRepository;

    public CompetitionService(CompetitionRepository competitionRepository) {
        this.competitionRepository = competitionRepository;
    }

    public List<CompetitionsEntity> getAll() {
        return competitionRepository.findAll();
    }

    public CompetitionsEntity save(CompetitionsEntity competitionsEntity) {
        return competitionRepository.save(competitionsEntity);
    }


}
