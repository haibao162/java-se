/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package web;

/**
 * 
 * @author predix -
 */
public class Hello {

	/**
	 * @param args -
	 */
	public void test(Object o){
		System.out.println("Object");
		
	}
	public void test(String s){
		System.out.println("String");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
Hello h=new Hello();
h.test(null);
String a="abc";
String b="a"+"bc";

System.out.println(a==b);
	}

}
