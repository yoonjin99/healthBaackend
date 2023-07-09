package com.example.exerciseBackend.controller;

import com.example.exerciseBackend.dto.request.ExerciseRequest;
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

    // 운동 등록
    @PostMapping("/insertExercise")
    public void insertExercise(@RequestBody ExerciseRequest exerciseRequest){
        exerciseService.insertExercise(exerciseRequest);
    }

    // 운동 수정

    // 운동 삭제
}
