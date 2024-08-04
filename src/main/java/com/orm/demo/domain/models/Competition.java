package com.orm.demo.domain.models;

import java.time.LocalDateTime;
import java.util.List;

public class Competition {
    private Integer idCompetition;
    private String stadium;
    private LocalDateTime dateCompetition;
    private List<Club> clubs;

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

    public List<Club> getClubs() {
        return clubs;
    }

    public void setClubs(List<Club> clubs) {
        this.clubs = clubs;
    }

}
