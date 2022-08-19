package com.learners.unimeta.entity;

import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
public class Session {
    @Id
    private int seq;
    private String id;
}
