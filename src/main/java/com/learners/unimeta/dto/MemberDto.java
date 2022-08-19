package com.learners.unimeta.dto;

import com.learners.unimeta.entity.Member;
import com.learners.unimeta.entity.Session;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class MemberDto {
    @Schema(example = "member1", description = "사용자 계정")
    private String id;
    @Schema(example = "test1234", description = "사용자 비밀번호")
    private String password;
    @Schema(example = "김이박", description = "사용자 이름")
    private String userName;

    public Member convertToEntity(){
        Member member = new Member();
        BeanUtils.copyProperties(this, member);
        return member;
    }
}
