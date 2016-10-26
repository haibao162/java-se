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
public class testThread implements Runnable{
private static Object obj = new Object();
public void run(){
	synchronized (obj){    //synchronized(this){}无法实现同步
		
	for(int i=0;i<250;i++){
		System.out.println(i);
	 }
	}
}
public static void main(String[] args){
	Thread t1=new Thread(new testThread());
	Thread t2=new Thread(new testThread());
	t1.start();
    t2.start();
}
}
