package com.learners.unimeta.dto;

import com.learners.unimeta.entity.Member;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginResult {
    Member member;
    String token;
}
