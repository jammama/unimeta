package com.learners.unimeta.service;

import com.learners.unimeta.dto.PointDto;
import com.learners.unimeta.entity.AvatarPoint;
import com.learners.unimeta.repository.AvatarPointRedisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AvatarPointService {

    private final AvatarPointRedisRepository avatarPointRedisRepository;

    public AvatarPoint savePoint(PointDto pointDto){
        return avatarPointRedisRepository.save(pointDto.convertToEntity());
    }
}
