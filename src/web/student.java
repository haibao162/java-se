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
public class student {
private String name;
private int rollNo;
student(String name,int rollNo){
	this.name=name;
	this.rollNo=rollNo;
}
public String getName(){
	return name;
	}
public void setName(String name){
	this.name=name;
	}
public int getRollNo(){
	return rollNo;
	
}
public void setRollNo(int rollNo){
	this.rollNo=rollNo;
}
/* (non-Javadoc)
 * @see java.lang.Object#toString()
 */

public String toString() {
	return "student [name=" + name + ", rollNo=" + rollNo + "]";
}
}
