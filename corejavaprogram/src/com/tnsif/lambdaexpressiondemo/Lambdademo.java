package com.tnsif.lambdaexpressiondemo;

public class Lambdademo {
	public static void main(String[] args) {
		
		Message m=()->{return "hello welcome!!";};
		System.out.println(m.greet());
	}

}
