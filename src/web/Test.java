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
public class Test {

	/**
	 * @param args -
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
studentDao stu=new studentDaoImpl();
		for(student s:stu.getAllStudents()){
			System.out.println(s.getRollNo()+","+s.getName());
			
		}
		//update
		student stu2=stu.getAllStudents().get(0);
	stu2.setName("Michael");
	stu.updateStudent(stu2);
	//get
	System.out.println(stu.getStudent(0));
	}

}
