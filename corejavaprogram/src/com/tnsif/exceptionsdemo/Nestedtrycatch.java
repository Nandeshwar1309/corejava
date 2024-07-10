package com.tnsif.exceptionsdemo;

public class Nestedtrycatch {
	public static void check() {
		
		String str="TNS";
		int slength=str.length();
		
		System.out.println("String length:"+slength);
		
		String anotherstring=null;
		int y=7;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e) {
				System.out.println("Exception Caught"+e.getMessage());
			}
			System.out.println(anotherstring.length());
		}
			catch(NullPointerException
					e) {
				System.out.println("Exception Caught"+e.getMessage());
			}
		}
	}


