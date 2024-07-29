package com.orm.demo.infraestructure.out.repositories;

import com.orm.demo.domain.entities.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<PlayerEntity, Integer> {
}
