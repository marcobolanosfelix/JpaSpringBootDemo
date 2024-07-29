package com.orm.demo.domain.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "couch")
@Getter
@Setter
public class CouchEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_couch")
    private Integer idCouch;
    @Column
    private String name;
    @Column
    private Integer status;

}
