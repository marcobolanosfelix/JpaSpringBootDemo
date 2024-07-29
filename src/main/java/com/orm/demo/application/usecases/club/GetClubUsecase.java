package com.orm.demo.application.usecases.club;

import com.orm.demo.application.mappers.ClubMapper;
import com.orm.demo.application.services.ClubService;
import com.orm.demo.domain.entities.ClubEntity;
import com.orm.demo.domain.models.Club;
import org.springframework.core.NestedRuntimeException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GetClubUsecase {
    private final ClubService clubService;
    private final ClubMapper clubMapper;

    public GetClubUsecase(ClubService clubService, ClubMapper clubMapper) {
        this.clubService = clubService;
        this.clubMapper = clubMapper;
    }


    public Club getById(Integer idClub) {
        ClubEntity clubEntity = clubService.getById(idClub).orElseThrow( () -> new RuntimeException("Club no existe") );
        return clubMapper.toModel( clubEntity );
    }

}
