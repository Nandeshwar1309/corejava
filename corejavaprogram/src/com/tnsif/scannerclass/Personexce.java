package com.tnsif.scannerclass;
import java.util.Scanner;
public class Personexce {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name:");
		String name=sc.nextLine();
		System.out.println("enter income:");
		int income=sc.nextInt();
		
		Person pp=new Person();
		pp.setName(name);
		pp.setIncome(income);
		
		Taxcalculation t=new Taxcalculation();
		t.calculatetax(pp);
		System.out.println("after modification:");
		System.out.println(pp);
		
	}

}
