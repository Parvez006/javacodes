package com.bldea.javatraining.oracle;
import java.util.Scanner;
public class Conditional_Statements_Q_and_A {
	public static void main(String[] args) {
	// 1) Write a java program to get a number from the user and print whether it is positive or negative.
	/*Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	if(n>0) 
		System.out.println("Positive");
	else if(n==0)
		System.out.println("Nutral");
	else 
		System.out.println("Negetive");*/
		
	// 2) identifying fever of a person
	/*	double temp = 98.67;
		String type = temp > 100? "You have a fever": "You don't have fever";
		System.out.println(type);*/
		
	// Write a java program to input week number (1-7) and print day of week name using switch case
	/*Scanner sc = new Scanner(System.in);
	System.out.println("Enter the week number");
	int weekNumber = sc.nextInt();
	switch(weekNumber) {
	case 1 : System.out.println("Monday");
	break;
	case 2 : System.out.println("Tuesday");
	break;
	case 3 : System.out.println("Wednesday");
	break;
	case 4 : System.out.println("Thursday");
	break;
	case 5 : System.out.println("Friday");
	break;
	case 6 : System.out.println("Saturday");
	break;
	case 7 : System.out.println("Sunday");
	break;
	default : System.out.println("Wrong number");
	}*/
		
	// Write a java program that takes a year from the user and print whether that year is a leap year or not.
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter year");
	int year = sc.nextInt();
	boolean x = (year%4)==0;
	boolean y = (year%100)!=0;
	boolean z = ((year%100)==0 && (year%400)==0);
	if(x && (y||z)) {
		System.out.println(year + " is a leap year");
	}else {
		System.out.println(year + " is not a leap year");
	}
		

	

}
}