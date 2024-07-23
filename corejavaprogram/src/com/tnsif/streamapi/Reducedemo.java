package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

public class Reducedemo {
	public static void main(String[] args) {
		List<Integer> number=Arrays.asList(1,2,3,4,5,6,7,8);
		
		int sum=number.stream().reduce(0, (a,b)->a+b);
		System.out.println("Sum of the numbers:"+sum);
	}

}
