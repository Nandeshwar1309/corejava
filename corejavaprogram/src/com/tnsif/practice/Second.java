package com.tnsif.practice;
import java.util.Scanner;
public class Second {
	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("Number is even");
		}
		else
			System.out.println("Number is odd");
		
	}
	

}
