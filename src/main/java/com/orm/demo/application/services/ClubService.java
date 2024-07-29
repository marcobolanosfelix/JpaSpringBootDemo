package com.orm.demo.application.services;

import com.orm.demo.domain.entities.ClubEntity;
import com.orm.demo.infraestructure.out.repositories.ClubRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClubService {
    private final ClubRepository clubRepository;

    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public List<ClubEntity> getAll() {
        return clubRepository.findAll();
    }

    public Optional<ClubEntity> getById(Integer idClub) {
        return clubRepository.findById(idClub);
    }

    public ClubEntity save(ClubEntity clubEntity) {
        return clubRepository.save(clubEntity);
    }

}
