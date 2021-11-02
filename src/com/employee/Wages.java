package com.employee;

public class Wages {
	public static void main(String[] args) {
		int Ispresent = 1;
		int parttime =1;
		double employee = Math.floor(Math.random()*2);
				System.out.println(employee);	
		if (employee == Ispresent)
			{
		if (parttime == Ispresent) {
           int wages=160;
			System.out.println("part time emplloyee is present \n wages" +wages);	
			}
//				System.out.println("Employee is present");
			int	wages = 160;
//				System.out.println("the employee wages is " +wages);
			}
		else 
		{
			int wages =0;
				System.out.println("Employee is absent");
				System.out.println("the employee wages is " +wages);
		}
	}
}
