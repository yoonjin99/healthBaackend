package com.example.exerciseBackend.service;

import com.example.exerciseBackend.dto.request.ExerciseRequest;
import com.example.exerciseBackend.dto.response.ExerciseChartResponse;
import com.example.exerciseBackend.dto.response.ExerciseDetail;
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

    public ExerciseDetail getExerciseDetail(int seq){
        return exerciseMapper.getExerciseDetail(seq);
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertExercise(ExerciseRequest exerciseRequest){
        exerciseTrxMapper.insertExercise(exerciseRequest);
    }

    @Transactional(rollbackFor = Exception.class)
    public void updateExercise(ExerciseRequest exerciseRequest){
        exerciseTrxMapper.updateExercise(exerciseRequest);
    }

    @Transactional(rollbackFor = Exception.class)
    public void deleteExercise(ExerciseRequest exerciseRequest){
        exerciseTrxMapper.deleteExercise(exerciseRequest);
    }

    public List<ExerciseChartResponse> getChartByExercise(int code){
        return exerciseMapper.getChartByExercise(code);
    }
}
