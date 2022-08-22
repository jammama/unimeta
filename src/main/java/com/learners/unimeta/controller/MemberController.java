package com.learners.unimeta.controller;

import com.learners.unimeta.dto.MemberDto;
import com.learners.unimeta.dto.PointDto;
import com.learners.unimeta.entity.Member;
import com.learners.unimeta.service.AvatarPointService;
import com.learners.unimeta.service.MemberService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;

@Tag(name = "user", description = "사용자 관련")
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class MemberController extends DefaultRestController{

    private final MemberService memberService;
    private final AvatarPointService avatarPointService;

    @PostMapping("/join")
    public DeferredResult<ResponseEntity<?>> join(
            @RequestBody MemberDto memberDto) {
        try {
            return successResponse(memberService.saveMember(memberDto));
        } catch (Exception e) {
            return failResponse(e);
        }
    }

    @PostMapping("/login")
    public DeferredResult<ResponseEntity<?>> login(
            @RequestBody MemberDto memberDto) {
        try {
            return successResponse(memberService.login(memberDto));
        } catch (Exception e) {
            return failResponse(e);
        }
    }

    @PostMapping("/logout")
    public DeferredResult<ResponseEntity<?>> logout(
            @RequestBody MemberDto memberDto) {
        try {
            return successResponse(memberService.logout(memberDto));
        } catch (Exception e) {
            return failResponse(e);
        }
    }

    @PostMapping("/point")
    public DeferredResult<ResponseEntity<?>> savePoint(
            @RequestBody PointDto pointDto) {
        try {
            return successResponse(avatarPointService.savePoint(pointDto));
        } catch (Exception e) {
            return failResponse(e);
        }
    }

    @PostMapping("/all_point")
    public DeferredResult<ResponseEntity<?>> getAllPoints() {
        try {
            return successResponse(avatarPointService.getAllPoint());
        } catch (Exception e) {
            return failResponse(e);
        }
    }
    @PostMapping("/all_users")
    public DeferredResult<ResponseEntity<?>> getAllUsers() {
        try {
            return successResponse(avatarPointService.getAllPoint());
        } catch (Exception e) {
            return failResponse(e);
        }
    }

}
