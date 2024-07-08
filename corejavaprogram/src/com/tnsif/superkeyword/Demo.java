package com.tnsif.superkeyword;
// child class
public class Demo extends Superex {
	
	int a=7;
	
	void drinking() {
		System.out.println("tea");
	}
	
	void display() {
		
		drinking();
		super.drinking();
	}
	
	Demo(){
		
		super();
	}
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.display();
	}

}
