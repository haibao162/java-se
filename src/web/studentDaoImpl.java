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

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author predix -
 */
public class studentDaoImpl implements studentDao{
List<student> students;
public studentDaoImpl(){
	students=new ArrayList<student>();
	student stu1=new student("Jiaxing Yang",0);
	student stu2=new student("Wendy",1);
	students.add(stu1);
	students.add(stu2);
}
public List<student> getAllStudents(){
	return students;
	}
public student getStudent(int rollNo){
	return students.get(rollNo);
	
}
public void updateStudent(student stu){
	students.get(stu.getRollNo()).setName(stu.getName());
	 System.out.println("Student: Roll No " + stu.getRollNo()   
             +", updated in the database");
}
public void deleteStudent(student stu) {  
    students.remove(stu.getRollNo());  
      System.out.println("Student: Roll No " + stu.getRollNo()   
         +", deleted from database");  
}  
}
