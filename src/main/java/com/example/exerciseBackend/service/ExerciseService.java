package com.example.exerciseBackend.service;

import com.example.exerciseBackend.dto.request.ExerciseRequest;
import com.example.exerciseBackend.mapper.ExerciseMapper;
import com.example.exerciseBackend.mapper.ExerciseTrxMapper;
import com.example.exerciseBackend.dto.response.ExerciseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExerciseService {

    private final ExerciseMapper exerciseMapper;
    private final ExerciseTrxMapper exerciseTrxMapper;

    public List<ExerciseResponse> getExerciseList(){
        return exerciseMapper.getExerciseList();
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertExercise(ExerciseRequest exerciseRequest){
        exerciseTrxMapper.insertExercise(exerciseRequest);
    }
}
