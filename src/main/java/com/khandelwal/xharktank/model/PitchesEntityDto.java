package com.khandelwal.xharktank.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import java.io.Serializable;

@Builder
@Getter
@Setter
public class PitchesEntityDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    private final Long id;

    @JsonProperty("entrepreneur")
    private final String entrepreneur;

    @JsonProperty("pitchTitle")
    private final String pitchTitle;

    @JsonProperty("pitchIdea")
    private final String pitchIdea;

    @JsonProperty("askAmount")
    private final Long askAmount;

    @JsonProperty("equity")
    private final Long equity;
}
