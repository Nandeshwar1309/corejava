package com.tnsif.exceptionsdemo;

public class Main {
	public static void main(String[] args) {
		int d=0;
		try {
			int a=65/0;
			System.out.println("welcome");
		}
		catch(ArithmeticException e) {
			System.out.println("exception caught");
		}
	}

}
