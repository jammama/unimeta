package com.learners.unimeta.dto;

import com.learners.unimeta.entity.AvatarPoint;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class PointDto {
    @Schema(example = "test")
    private String id;
    @Schema(example = "3,6,2")
    private String point;

    public AvatarPoint convertToEntity(){
        AvatarPoint avatarPoint = new AvatarPoint();
        BeanUtils.copyProperties(this, avatarPoint);
        return avatarPoint;
    }
}
