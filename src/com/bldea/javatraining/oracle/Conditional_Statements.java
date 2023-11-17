package com.bldea.javatraining.oracle;
import java.util.Scanner;
public class Conditional_Statements {
	public static void main(String[] args) {
		// 1) if-else Statement
		// age problem
		/*int age = 14;
		if (age>=18) {
			System.out.println("adult");
		}
		if (age>=13 && age<18) {
			System.out.println("teenager");
		}
		else {
			System.out.println("Not adult");
		}*/
		
		// Print the largest of two 
		
		/*int a = 6;
		int b = 5;
		if(a>=b) {
			System.out.println("a is largest of two");
		}
		else {
			System.out.println("b is largest of two");
		}*/
		
		// Print if a number is Odd or Even
		/*Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number % 2 == 0) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}*/
		
		//2) else if statement
		/*int age = 19;
		if(age >= 18) {
			System.out.println("adult");
		}
		else if(age >= 13 && age<18) {
			System.out.println("teenager");
		}
		else {
			System.out.println("not adult");
		}*/
		
		// INCOME TAX CALCULATION
		/*
		Scanner sc = new Scanner(System.in);
		int income = sc.nextInt();
		int tax;
		if(income<=500000) {
			tax = 0;
		}
		else if(income>500000 && income <= 100000) {
			tax = (int)(income*(0.2));
		}
		else {
			tax = (int)(income*(0.3));
		}
		System.out.println("The tax to be paid is "+ tax);
	}
	*/
	     // Print the largest of 3
		/*System.out.println("Enter 3 numbers");
		Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	if((a>=b) && (a>=c)) {
		System.out.println("Largest is a");
		}
	else if(b>=c) {
		System.out.println("Largest is b");
	}else {
		System.out.println("Largest is c");
	}*/
		
		//3)Ternary Operator
		/*int number = 4;
		String type = number%2==0 ? "even" : "Odd";
		System.out.println(type);*/
		
		// Check if a student will Pass or Fail
		/*int marks = 27;
		String status = marks>=33 ? "Pass" : "Fail";
		System.out.println(status);*/
		
		//4) Switch Statement
		/*char ch = 'b';
		switch(ch){
		case 'a' : System.out.println("pizza");	
		         break;
		case 'c' : System.out.println("berger");   
	             break;
		case 'b' : System.out.println("fries");
		         break;
		default : System.out.println("we wake up");         
		}*/
		
		//  Making calculator Using Switch Statement
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a : ");
		//int a = sc.nextInt();
		//System.out.println("Enter b : ");
		//int b = sc.nextInt();
		//System.out.println("Enter Operator : ");
		//char Operator = sc.next().charAt(0);
		/*switch(Operator) {
		case '+' : System.out.println(a+b);
 		break;
		case '-' : System.out.println(a-b);
		break;
		case '*' : System.out.println(a*b);
		break;
		case '/' : System.out.println(a/b);
		break;
		case '%' : System.out.println(a%b);
		break;
		default : System.out.println("Please buy advance Calci");
		}*/
	}
	}
	

