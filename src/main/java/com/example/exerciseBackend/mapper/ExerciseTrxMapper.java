package com.example.exerciseBackend.mapper;

import com.example.exerciseBackend.dto.request.ExerciseRequest;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseTrxMapper {
    void insertExercise(ExerciseRequest exerciseRequest);
}
