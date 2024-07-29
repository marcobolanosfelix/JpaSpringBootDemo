package com.orm.demo.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;


@Entity
@Table(name = "competition")
public class CompetitionsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_competition")
    private Integer idCompetition;
    @Column
    private String stadium;
    @Column(name = "date_competition")
    private LocalDateTime dateCompetition;


    public Integer getIdCompetition() {
        return idCompetition;
    }

    public void setIdCompetition(Integer idCompetition) {
        this.idCompetition = idCompetition;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public LocalDateTime getDateCompetition() {
        return dateCompetition;
    }

    public void setDateCompetition(LocalDateTime dateCompetition) {
        this.dateCompetition = dateCompetition;
    }

}
