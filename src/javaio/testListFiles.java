/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package javaio;
import java.io.*;
/**
 * 
 * @author predix -
 */
public class testListFiles {

	/**
	 * @param args -
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
File dir=new File(".");

File[] subs=dir.listFiles();
for(File sub:subs){
	System.out.println(sub);
}
File file=new File("src");
File[] files=file.listFiles();
for(File temp:files){
	System.out.println(temp);
	
}
for(File temp2:files){
	//String str=temp2.toString().substring(4);
	System.out.println(temp2.toString().substring(4));
}


	}
	

}
