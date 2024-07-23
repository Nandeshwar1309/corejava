package com.tnsif.lambdaexpressiondemo;

public class Parameterdemo {
	public static void main(String[] args) {
		cube c=(s)->{return(s*s*s);};
		System.out.println("area of cube:"+c.calculate(5));
	}

}
