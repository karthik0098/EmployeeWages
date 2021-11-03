package com.employee;

public class Wages {
public static void main(String[] args) {
	double attendance =Math.floor(Math.random()*2);
	double partTime =Math.floor(Math.random()*2);

      int exp = 0;
	int wages; 
    	System.out.println(attendance);
    System.out.println(attendance);
if(attendance == 1) {
   		System.out.println("Employee is present");
   if(partTime == 1) {
   		wages=160;
   		System.out.println("Employee is present & PartTime \nwages = " + wages);

   		exp=1;
   }
    else 
    {
    	wages=160;
   			System.out.println("Employee is present & FullTime \nwages = " + wages);

    	 exp=2;
    }
}
	else 
	{
         wages=0;
   		System.out.println("Employee is absent \nwages = " + wages);
	}

     exp=0;
switch(exp) {
case 0:
	   wages=0;
	   wages=0 * 20 ;
		System.out.println("Employee is absent \nwages = " + wages);
case 1:
	   wages=160 *20 ;
	   wages=((100/20)*20)*20 ;
		System.out.println("Employee is present & PartTime \nwages = " + wages);

case 2:
	  wages=160 * 20 ;
	  wages=((100/20)*20)*20 ;
		System.out.println("Employee is present & FullTime \nwages = " + wages);


		} 
	}
}
