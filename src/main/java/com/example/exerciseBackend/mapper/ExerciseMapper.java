package com.example.exerciseBackend.mapper;

import com.example.exerciseBackend.dto.response.ExerciseChartResponse;
import com.example.exerciseBackend.dto.response.ExerciseDetail;
import com.example.exerciseBackend.dto.response.ExerciseResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseMapper {
    List<ExerciseResponse> getExerciseList();
    ExerciseDetail getExerciseDetail(int seq);

    List<ExerciseChartResponse> getChartByExercise(int code);
}
