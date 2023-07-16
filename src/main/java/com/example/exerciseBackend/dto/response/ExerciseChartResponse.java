package com.example.exerciseBackend.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

import java.time.LocalDate;

@Getter
@Setter
@Alias("ExerciseChartResponse")
public class ExerciseChartResponse {
    private long totalWeight;
    private LocalDate exerciseDate;
}
