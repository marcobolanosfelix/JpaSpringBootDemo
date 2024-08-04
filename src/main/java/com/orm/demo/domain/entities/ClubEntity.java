package com.orm.demo.domain.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "club")
public class ClubEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_club")
    private Integer idClub;
    @Column
    private String name;
    @Column
    private Integer status;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_couch", nullable = false, updatable = false)
    private CouchEntity couch;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "club")
    private List<PlayerEntity> players;


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

    public CouchEntity getCouch() {
        return couch;
    }

    public void setCouch(CouchEntity couch) {
        this.couch = couch;
    }

    public List<PlayerEntity> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerEntity> players) {
        this.players = players;
    }

}
