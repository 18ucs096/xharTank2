package com.khandelwal.xharktank.mapper;

import com.khandelwal.xharktank.entity.PitchesEntity;
import com.khandelwal.xharktank.model.PitchesEntityDto;

public class PitchesEntityMapper {
    private PitchesEntityMapper() {

    }

    public static PitchesEntity dtoToEntity(PitchesEntityDto pitchesEntityDto) {
        if (pitchesEntityDto == null) {
            return null;
        }

        return PitchesEntity.builder()
                .id(pitchesEntityDto.getId())
                .askAmount(pitchesEntityDto.getAskAmount())
                .entrepreneur(pitchesEntityDto.getEntrepreneur())
                .pitchIdea(pitchesEntityDto.getPitchIdea())
                .pitchTitle(pitchesEntityDto.getPitchTitle())
                .build();
    }
}
