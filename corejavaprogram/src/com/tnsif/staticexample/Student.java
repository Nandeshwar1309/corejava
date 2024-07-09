package com.tnsif.staticexample;

public class Student {
	int rollno;
	String name;
	
	static String college="Sriindu"; //Static member
	
	static void change() {    // Static method
		college="CVR";
		
	}
	Student(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}

}
