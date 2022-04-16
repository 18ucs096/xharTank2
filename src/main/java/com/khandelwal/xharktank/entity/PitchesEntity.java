package com.khandelwal.xharktank.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@AllArgsConstructor
@Entity
@Builder
@Data
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.LowerCaseStrategy.class)
@Table(name = "PITCHES")
public class PitchesEntity implements Serializable {
    private static final long serialVersionUID = 1;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "entrepreneur")
    private String entrepreneur;

    @Column(name = "pitchTitle")
    private String pitchTitle;

    @Column(name = "pitchIdea")
    private String pitchIdea;

    @Column(name = "askAmount")
    private Long askAmount;

    @Column(name = "equity")
    private Long equity;

}
