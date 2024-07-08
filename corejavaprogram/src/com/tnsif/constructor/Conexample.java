package com.tnsif.constructor;

public class Conexample {
	
	Conexample(){
		System.out.println("default constructor");
	}
	
	Conexample(int i){
		System.out.println("welcome");
	}
	
	Conexample(int i,int j){
		System.out.println("Hello world!!");
	}
	
	Conexample(int i,String n){
		System.out.println("different types");
	}
	
	public static void main(String[] args) {
		Conexample c=new Conexample();
		Conexample c1=new Conexample(8,9);
		Conexample c2=new Conexample(8,"n");
		
	}

}
