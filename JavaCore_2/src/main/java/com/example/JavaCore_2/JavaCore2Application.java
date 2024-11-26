package com.example.JavaCore_2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCore2Application {

	public static void main(String[] args) {
		int[] arr = {2, 3, 4, 0, 0, 6, 9};
		System.out.println(CountEvens.even(arr));
		System.out.println(DiffMinMax.diff(arr));
		System.out.println(Identical.identNull(arr));
	}

}
