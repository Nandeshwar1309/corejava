package com.tnsif.stringdemo;

public class Stringbufferdemo {
	public static void main(String[] args) {
		StringBuffer b=new StringBuffer("Welcome");
		b.append("to java");
		
		System.out.println(b);
		
		b.insert(3, "hi");
		System.out.println(b);
		b.delete(3,5);
		System.out.println(b);
		System.out.println(b.reverse());
		
				
	}

}
