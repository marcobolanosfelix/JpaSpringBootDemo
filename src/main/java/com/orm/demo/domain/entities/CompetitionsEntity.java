package com.orm.demo.domain.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;


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

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "club_competition",
            joinColumns = @JoinColumn( name = "id_competition" ),
            inverseJoinColumns = @JoinColumn( name = "id_club" )
    )
    private List<ClubEntity> clubs;


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

    public List<ClubEntity> getClubs() {
        return clubs;
    }

    public void setClubs(List<ClubEntity> clubs) {
        this.clubs = clubs;
    }
}
