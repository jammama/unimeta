package com.learners.unimeta.repository;

import com.learners.unimeta.entity.AvatarPoint;
import org.springframework.data.repository.CrudRepository;

public interface AvatarPointRedisRepository extends CrudRepository<AvatarPoint, String> {
}
