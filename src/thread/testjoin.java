/*
 * Copyright (c) 2016 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */
 
package thread;

/**
 * 
 * @author predix -
 */
public class testjoin implements Runnable{
public static int a=0;
public void run(){
	for(int k=0;k<5;k++){
		a=a+1;
	}
}
public static void main(String[] args)throws Exception{
	Thread t=new Thread(new testjoin());
	t.start();
	t.join();
	System.out.println(testjoin.a);
}	
}
