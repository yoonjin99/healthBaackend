package com.example.exerciseBackend.mapper;

import com.example.exerciseBackend.dto.response.ExerciseResponse;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExerciseMapper {
    List<ExerciseResponse> getExerciseList();
}
