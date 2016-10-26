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
public class thread2 extends Thread{
	private thread1 t;
	public void setThread1(thread1 t){  //没有set函数，会报空指针异常
		this.t=t;
	}
	public void run(){
		try{
			 t.join();
		}catch(Exception e){e.printStackTrace();}
	for(int i=0;i<40;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	public static void main(String[] args){
		thread1 t1=new thread1();
		thread2 t2=new thread2();
		t2.setThread1(t1);     //不加报空指针异常
		Thread T1=new Thread(t1);
		Thread T2=new Thread(t2);
		T1.start();
		T2.start();
	}
}
