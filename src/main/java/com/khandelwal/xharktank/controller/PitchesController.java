package com.khandelwal.xharktank.controller;

import com.khandelwal.xharktank.model.PitchesEntityDto;
import com.khandelwal.xharktank.service.PitchesService;
import io.swagger.models.Response;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping()
@RestController
public class PitchesController {
    private final PitchesService pitchesService;

    public PitchesController(PitchesService pitchesService) {
        this.pitchesService = pitchesService;
    }

    @PostMapping(value = "/pitches")
    public String getPitcherIdAfterSave(PitchesEntityDto pitchesEntityDto) {
        return this.pitchesService.getId(pitchesEntityDto);
    }
}
