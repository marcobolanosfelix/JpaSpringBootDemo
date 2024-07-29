package com.orm.demo.application.usecases.club;

import com.orm.demo.application.mappers.ClubMapper;
import com.orm.demo.application.services.ClubService;
import com.orm.demo.domain.entities.ClubEntity;
import com.orm.demo.domain.models.Club;
import org.springframework.stereotype.Service;

@Service
public class SaveClubUsecase {
    private final ClubService clubService;
    private final ClubMapper clubMapper;

    public SaveClubUsecase(ClubService clubService, ClubMapper clubMapper) {
        this.clubService = clubService;
        this.clubMapper = clubMapper;
    }

    public Club save(Club club) {
        ClubEntity entity = clubMapper.toEntity(club);
        return clubMapper.toModel(clubService.save(entity) );
    }

}
