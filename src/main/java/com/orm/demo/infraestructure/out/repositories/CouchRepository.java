package com.orm.demo.infraestructure.out.repositories;

import com.orm.demo.domain.entities.CouchEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouchRepository extends JpaRepository<CouchEntity, Integer> {
}
