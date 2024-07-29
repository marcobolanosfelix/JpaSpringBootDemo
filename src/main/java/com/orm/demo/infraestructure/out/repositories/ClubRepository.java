package com.orm.demo.infraestructure.out.repositories;

import com.orm.demo.domain.entities.ClubEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClubRepository extends JpaRepository<ClubEntity, Integer> {
}
