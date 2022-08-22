package com.learners.unimeta.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Getter
@Setter
@RedisHash("avatarPoint")
public class AvatarPoint implements Serializable {

    @Id
    private int seq;
    private Float x;
    private Float y;
    private Float Z;
    private int state;

}
