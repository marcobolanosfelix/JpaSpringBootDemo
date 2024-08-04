package com.orm.demo.domain.models;


public class Club {
    private Integer idClub;
    private String name;
    private Integer status;
    private Couch couch;

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

}
