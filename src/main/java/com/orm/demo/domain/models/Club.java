package com.orm.demo.domain.models;

import java.util.List;


public class Club {
    private Integer idClub;
    private String name;
    private Integer status;
    private Couch couch;
    private List<Competition> competitions;

    public Integer getIdClub() {
        return idClub;
    }

    public void setIdClub(Integer idClub) {
        this.idClub = idClub;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Couch getCouch() {
        return couch;
    }

    public void setCouch(Couch couch) {
        this.couch = couch;
    }

    public List<Competition> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<Competition> competitions) {
        this.competitions = competitions;
    }
}
