package com.learners.unimeta.entity;

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
    private String id;
    private String point;

}
