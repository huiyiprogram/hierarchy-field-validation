package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
//		Predicate<Integer> noGreaterThan5 = x -> x > 5;
//        Predicate<Integer> noLessThan8 = x -> x < 8;
//
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        Predicate something = (value) -> {
//        	return true;
//        };
//        
//        List<Integer> collect = list.stream()
//                .filter(noGreaterThan5.and(noLessThan8))
//                .collect(Collectors.toList());
//
//        System.out.println(collect);
	}
}
