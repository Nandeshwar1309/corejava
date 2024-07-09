package com.tnsif.interfacedemo;
// nested interface
public interface Myinterface {
	
	void calculatearea();
	
	// nested interface
	interface Myinnerinterface{
		int id=30;
		void print();
	}

}
