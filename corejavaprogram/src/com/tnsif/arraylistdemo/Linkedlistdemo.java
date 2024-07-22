package com.tnsif.arraylistdemo;

import java.util.LinkedList;
public class Linkedlistdemo {
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("ar");
		l.add(6);
		l.add("hdb");
		l.add(7.7);
		
		System.out.println("After invoking add()"+l);
		
		l.add(1,"Ball");
		
		l.addFirst("f");
		l.addLast("hello");
		
		System.out.println(l);
		
	}

}
