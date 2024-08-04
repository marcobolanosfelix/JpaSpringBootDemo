package com.orm.demo.application.usecases.competition;

import com.orm.demo.application.mappers.CompetitionMapper;
import com.orm.demo.application.services.CompetitionService;
import com.orm.demo.domain.models.Competition;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllCompetitionUsecase {
    private final CompetitionService competitionService;
    private final CompetitionMapper competitionMapper;

    public GetAllCompetitionUsecase(CompetitionService competitionService, CompetitionMapper competitionMapper) {
        this.competitionService = competitionService;
        this.competitionMapper = competitionMapper;
    }

    public List<Competition> getAll() {
        return competitionMapper.toModelList( competitionService.getAll() );
    }

}
