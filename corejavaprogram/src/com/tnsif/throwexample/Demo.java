package com.tnsif.throwexample;

import java.util.Scanner;
public class Demo {
	
	// demo for throws
	public class Testdemo{
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the rollno:");
			
			int rollno=sc.nextInt();
			
			if(rollno<0) {
				throw new ArithmeticException("roll number cannot be negative");
			}
			
			else {
				System.out.println("valid rollno");
			}
		}
		
	}

}
