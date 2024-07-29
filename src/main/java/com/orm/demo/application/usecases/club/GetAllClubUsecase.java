package com.orm.demo.application.usecases.club;

import com.orm.demo.application.mappers.ClubMapper;
import com.orm.demo.application.services.ClubService;
import com.orm.demo.domain.models.Club;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetAllClubUsecase {
    private final ClubService clubService;
    private final ClubMapper clubMapper;

    public GetAllClubUsecase(ClubService clubService, ClubMapper clubMapper) {
        this.clubService = clubService;
        this.clubMapper = clubMapper;
    }

    public List<Club> getAll() {
        return clubMapper.toModelList( clubService.getAll() );
    }

}
