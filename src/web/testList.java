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
public class testList {
public static void main(String[] args){
	List<student>  list =new ArrayList<student>();
	student s1=new student("e",1323);
	student s2=new student("2323",2);
	list.add(s1);
	list.add(s2);
	System.out.println(list.get(1));
	}
}
