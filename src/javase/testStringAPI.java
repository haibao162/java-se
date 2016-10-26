/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package javase;

import java.util.Date;



/**
 * 
 * @author predix -
 */
public class testStringAPI {
public static void main(String[] args){
	String str1=String.format("I have %.2f bugs to fix.", 476578.09876);
	System.out.println(str1);
	System.out.println(String.format("%tc",new Date()));
    System.out.println(String.format("%tr", new Date()));

}
}
