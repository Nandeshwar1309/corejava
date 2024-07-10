package com.tnsif.exceptionsdemo;
import java.util.InputMismatchException;

public class Division {
	public static void divide() {
		int a=10,b=0,c;
		
		try {
			c=a/b;
			System.out.println("Division:"+c);
		}
		catch(InputMismatchException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception caught"+e.getMessage());
		}
	}

}
