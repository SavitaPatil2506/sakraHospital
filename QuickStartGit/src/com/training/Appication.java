package com.training;

import java.util.Arrays;
import java.util.List;

public class Appication {

	public static void main(String[] args) {

		
		List<String>nameList=Arrays.asList("Ramesh","Ravi","Suresh");
		nameList.forEach(System.out::println);

	}

}
