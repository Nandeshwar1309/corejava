package com.tnsif.collections;
import java.util.Vector;
public class Vectordemo {
public static void main(String[] args) {
		
		Vector<String> v=new Vector<String>();
		System.out.println("size of vector "+v.size());
		v.add("apple");
		v.add("ball");
		v.add("cat");
		v.add("dog");
		v.add("fish");
		int capacity=v.capacity();
		System.out.println(capacity);
		v.add(4, "elephant");
		System.out.println(v);
		v.add("cat");
		v.add("cat");
		v.add("cat");
		v.add("cat");
		v.add("cat");
		v.add("cat");
		v.add("cat");
		v.add("cat");
		
		int capacity1=v.capacity();
		System.out.println(capacity1);
		
	}

}
	


