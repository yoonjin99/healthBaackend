package com.example.exerciseBackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class ExerciseBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExerciseBackendApplication.class, args);
	}

}
