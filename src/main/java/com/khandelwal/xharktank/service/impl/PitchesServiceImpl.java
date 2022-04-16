package com.khandelwal.xharktank.service.impl;

import com.khandelwal.xharktank.datarepository.PitchesDataRepository;
import com.khandelwal.xharktank.mapper.PitchesEntityMapper;
import com.khandelwal.xharktank.model.PitchesEntityDto;
import com.khandelwal.xharktank.service.PitchesService;
import org.springframework.stereotype.Service;

@Service
public class PitchesServiceImpl implements PitchesService {
    private final PitchesDataRepository pitchesDataRepository;

    public PitchesServiceImpl(PitchesDataRepository pitchesDataRepository) {
        this.pitchesDataRepository = pitchesDataRepository;
    }

    @Override
    public String getId(PitchesEntityDto pitchesEntityDto) {
        return this.pitchesDataRepository.save(PitchesEntityMapper.dtoToEntity(pitchesEntityDto)).getPitchIdea();
    }
}
