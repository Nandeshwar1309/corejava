package com.tnsif.lambdaexpressiondemo;

import java.util.ArrayList;

public class Lambdaexpression {
	public static void main(String[] args) {
		ArrayList<Integer> li=new ArrayList<>();
		
		li.add(2);
		li.add(7);
		li.add(3);
		li.add(8);
		li.add(0);
		
		li.forEach(ele->System.out.println(ele));
	}

}
