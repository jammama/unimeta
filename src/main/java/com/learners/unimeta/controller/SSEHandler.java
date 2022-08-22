package com.learners.unimeta.controller;

import com.learners.unimeta.service.AvatarPointService;
import com.learners.unimeta.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequiredArgsConstructor
public class SSEHandler {

    private final AvatarPointService avatarPointService;

    @GetMapping(value = "/users_location", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<List> streamFlux() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(seq -> avatarPointService.getAllPoint());
    }
}

