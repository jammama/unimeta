package com.learners.unimeta.dto;

import com.learners.unimeta.entity.AvatarPoint;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.springframework.beans.BeanUtils;

@Data
public class PointDto {
    @Schema(example = "1")
    private int seq;
    @Schema(example = "366")
    private Float x;
    @Schema(example = "1266")
    private Float y;
    @Schema(example = "-363")
    private Float z;
    @Schema(example = "1")
    private int state;

    public AvatarPoint convertToEntity(){
        AvatarPoint avatarPoint = new AvatarPoint();
        BeanUtils.copyProperties(this, avatarPoint);
        return avatarPoint;
    }
}
