package com.learners.unimeta.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Member {
    @Id
    @GeneratedValue
    private int seq;
    @Schema(example = "member1", description = "사용자 계정")
    private String id;
    @Schema(example = "test1234", description = "사용자 비밀번호")
    private String password;
    @Schema(example = "김이박", description = "사용자 이름")
    private String userName;

}
