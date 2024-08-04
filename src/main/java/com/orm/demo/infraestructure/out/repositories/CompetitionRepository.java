package com.orm.demo.infraestructure.out.repositories;

import com.orm.demo.domain.entities.CompetitionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<CompetitionsEntity, Integer> {
}
