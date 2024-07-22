package com.tnsif.setdemo;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Setoperation {
	public static void operation() {
		Set<Integer> n=new HashSet<Integer>();
		
		n.add(1);
		n.add(6);
		n.add(8);
		n.add(9);
		System.out.println(n);
		
		n.addAll(Arrays.asList(new Integer[] {1,5,6}));
		System.out.println(n);
		System.out.println(n.size());
		
		Set<Integer> oddset=new HashSet<Integer>();
		oddset.addAll(Arrays.asList(new Integer[] {3,5,9}));
		
		System.out.println("odd set "+oddset);
		
		Set<Integer> intersection=new HashSet<>(n);
		intersection.retainAll(oddset);
		System.out.println(intersection);
			
	}	

}
