package com.learners.unimeta.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class LoginDto {
    @Schema(example = "member1", description = "사용자 계정")
    private String id;
    @Schema(example = "test1234", description = "사용자 비밀번호")
    private String password;
}
