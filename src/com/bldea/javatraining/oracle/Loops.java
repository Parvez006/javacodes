package com.bldea.javatraining.oracle;
import java.util.Scanner;
public class Loops {
	public static void main(String[] args) { 
	// while loop
	// Print hello 100 times
/*	int counter = 0;
	while(counter < 100) {
		System.out.println("Hello World");
		counter+=1;
	}
	System.out.println("Printed Hello World 100x");*/
		
		//  Print number from 1 to 100
	/*	int counter = 1;
		while(counter<=1000) {
			System.out.print(counter +" ");
			counter++;
		}
		System.out.println();*/
		
		// Print number from 1 to n
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int counter = 1;
		while(counter<=n) {
			System.out.print(counter+ " ");
			counter++;
		}
		System.out.println();*/
		
		// Print sum of first n natural numbers
		
	/*	Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int counter = 1;
		int sum = 0;
		while(counter <= range) {
			sum = sum+counter;
			counter++;
		}
		System.out.println(sum);*/
		
		// for loop
		// Print Hello World 10 times
		
	/*	for(int i=1; i<=10; i++) {
			System.out.println("Hello World");
		}*/
		
		// Print SQUARE pattern
	/*	for(int lines = 1; lines<=4; lines++) {
			System.out.println("* * * *");
		}*/
		
		// print Reverse of a number
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0) {
			int lastDigit = n%10;
			System.out.print(lastDigit);
			n = n/10;
		}*/
		
		//Reverse the given number
		int n = 20000;
		int rev = 0;
		while(n%10==0) {
			System.out.print("0");
			n/=10;
		}
		while(n>0) {
			int lastDigit = n%10;
			rev = (rev*10)+lastDigit;
			n/=10;
		}
		System.out.println(rev);
		
		//break statement
		/*int i = 1;
		while(i<=5) {
			if(i==3) {
				break;
			}
			System.out.println(i);
			i++;
		}
		System.out.println("I am out");*/
		
		//keep entering the numbers till user enters a multiple of 10
		/*Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number");
			int i = sc.nextInt();
			if(i%10==0) {
				break;
			}
			System.out.println(i);
		}while(true);*/
		
		//Continue Statement
		/*for(int i=1; i<=5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}*/
		
		//Display all numbers entered by user except multiples of 10
		/*Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the numbers");
			int i = sc.nextInt();
			if(i%10==0) {
				continue;
			}
			System.out.println(i);
		}while(true);*/
		
		// Check if a number is prime or not
		
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		if(n==2) {
			System.out.println("2 is a prime number");
		}else {
			for(int i = 2; i<=Math.sqrt(n); i++ ) {
				if(n%i == 0) {
					isPrime = false;
				}	
			}
			if(isPrime==true) {
				System.out.println(n +" is a prime number");
			}else {
				System.out.println(n +" is not a prime number ");
			}
			
		}*/
		
		// Loops Questions and Answers
		
		//1) Write a program that reads a set of integers and then prints thje sum of the even and odd integers.
		/*Scanner sc = new Scanner(System.in);
		int n;
		int choice;
		int evenSum = 0;
		int oddSum = 0;
		do {
			System.out.println("Enter the number");
			n = sc.nextInt();
			if(n%2==0) {
				evenSum+=n;
			}else {
				oddSum+=n;
			}
			System.out.println("Do you want to continue press 1 to continue and press 2 to stop ");
			choice = sc.nextInt();
		}while(choice==1);
		System.out.println("even sum is "+ evenSum );
		System.out.println("odd sum is "+ oddSum );*/
		
		//Write a program to find the factorial of any number entered by the user
		
		//Scanner sc = new Scanner(System.in);
		/*int n = sc.nextInt();
		int fac = 1;
		for(int i = n; i>=1; i--) {
			fac *= i;
		}
		System.out.println("The factorail is "+ fac);*/
		
		//Write a program to print the multiplication table of a number N,entered by the user.
		
		/*Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int table;
		for(int i=1; i<=10; i++) {
			table = n*i;
			System.out.println(n+"*"+i+"="+table);
		}*/
 		
	}	
}
