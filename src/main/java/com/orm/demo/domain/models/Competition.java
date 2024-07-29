package com.orm.demo.domain.models;

import java.time.LocalDateTime;
import java.util.List;

public class Competition {
    private Integer idCompetition;
    private String stadium;
    private LocalDateTime fecha;
//    private List<Competition> competitions;

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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

//    public List<Competition> getCompetitions() {
//        return competitions;
//    }
//
//    public void setCompetitions(List<Competition> competitions) {
//        this.competitions = competitions;
//    }
}
