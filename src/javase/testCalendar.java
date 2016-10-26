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

import java.util.Calendar;

/**
 * 
 * 
 */
public class testCalendar {
public static void main(String[] args){
Calendar c=Calendar.getInstance();
c.set(2004,1,7,15,40);
System.out.println(c+"\n,"+c.getTime());
System.out.println(String.format("%tc", c));//Sat Feb 07 15:40:02 PST 2004
System.out.println(c.getTimeInMillis());//1076197218693
long day1=c.getTimeInMillis();
day1+=1000*60*60;
c.setTimeInMillis(day1);
System.out.println(c.get(c.HOUR_OF_DAY));//add one hour
c.add(c.DATE,35);
System.out.println("add 35 days:"+c.getTime());
c.roll(c.DATE, 35);
System.out.println("roll 35 days:"+c.getTime());
c.set(c.DATE,1);
System.out.println("set to 1:"+c.getTime());

}
}
