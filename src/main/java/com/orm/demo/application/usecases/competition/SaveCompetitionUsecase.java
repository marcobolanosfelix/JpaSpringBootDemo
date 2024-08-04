package com.orm.demo.application.usecases.competition;

import com.orm.demo.application.mappers.CompetitionMapper;
import com.orm.demo.application.services.CompetitionService;
import com.orm.demo.domain.entities.CompetitionsEntity;
import com.orm.demo.domain.models.Competition;
import org.springframework.stereotype.Service;

@Service
public class SaveCompetitionUsecase {
    private final CompetitionService competitionService;
    private final CompetitionMapper competitionMapper;

    public SaveCompetitionUsecase(CompetitionService competitionService, CompetitionMapper competitionMapper) {
        this.competitionService = competitionService;
        this.competitionMapper = competitionMapper;
    }


    public Competition save(Competition competition) {
        CompetitionsEntity competitionsEntity = competitionMapper.toEntity(competition);
        return competitionMapper.toModel( competitionService.save( competitionsEntity ) );
    }

}
