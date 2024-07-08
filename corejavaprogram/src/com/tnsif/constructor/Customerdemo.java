package com.tnsif.constructor;

import java.util.Scanner;

public class Customerdemo {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the name:");
		String name=sc.nextLine();
		
		System.out.println("enter cid:");
		int id=sc.nextInt();
		
		System.out.println("enter the caddress:");
		String address=sc.next();
		
		Customer c=new Customer();
		c.setCname(name);
		c.setCid(id);
		c.setCaddress(address);
		
		System.out.println(c);
		
	}

}
