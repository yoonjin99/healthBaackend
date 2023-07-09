package com.example.exerciseBackend.dto.response;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.type.Alias;

@Getter
@Setter
@Alias("ExerciseDetail")
public class ExerciseDetail {
    private int seq;
    private int code;
    private String name;
    private int setNumber;
    private int times;
    private int weight;
}
