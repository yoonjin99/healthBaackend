package com.example.exerciseBackend.controller;

import com.example.exerciseBackend.dto.request.ExerciseRequest;
import com.example.exerciseBackend.dto.response.ExerciseDetail;
import com.example.exerciseBackend.service.ExerciseService;
import com.example.exerciseBackend.dto.response.ExerciseResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExerciseController {

    private final ExerciseService exerciseService;

    // 운동 목록 조회
    @GetMapping("/getExerciseList")
    public List<ExerciseResponse> getExerciseList(){
        return exerciseService.getExerciseList();
    }

    @GetMapping("/getExerciseDetail")
    public ExerciseDetail getExerciseDetail(int seq){
        return exerciseService.getExerciseDetail(seq);
    }

    // 운동 등록
    @PostMapping("/insertExercise")
    public void insertExercise(@RequestBody ExerciseRequest exerciseRequest){
        exerciseService.insertExercise(exerciseRequest);
    }

    // 운동 수정
    @PostMapping("/updateExercise")
    public void updateExercise(@RequestBody ExerciseRequest exerciseRequest){
        exerciseService.updateExercise(exerciseRequest);
    }

    // 운동 삭제
    @PostMapping("/deleteExercise")
    public void deleteExercise(@RequestBody ExerciseRequest exerciseRequest){
        exerciseService.deleteExercise(exerciseRequest);
    }
}
