package com.bldea.javatraining.oracle;
import java.util.*;
public class Functions_or_Methods {
	public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		return;
	}
	public static int printSum(int a,int b) {
		int sum = a+b;
		return sum;
	}
	
	public static float returnValue(float a, float b) {
		float pro =(a*b);
		return pro;
		
	}
	
	public static int fact(int n) {
		int fact = 1;
		for(int i = n; i>=1; i--) {
			fact *= i;
		}
		return fact;
	}
	
	public static float binomialCoe(int n , int r) {
		int a = fact(n);
		int b = fact(r);
		int c = fact(n-r);
		float BC = a/(b*c);
		return BC;
	}
	
	public static void main(String[] args) {
		sumOfDigit(102);
		
	}
	
	// Functions Overloading
	
	//1) Functions overloading using Parameters
	
	// sum of two numbers
	//public static int sum(int a , int b) {
	//	return a+b;
	//}
	
	// sum of three numbers
	//public static int sum(int a , int b , int c) {
	//	return a+b+c;
	//}
	
	//2) Function overloading using Data Types
	
	// sum of two int variables
	public static int sum(int a , int b) {
		return a+b;
	}
	
	// sum of two float variables
	public static float sum(float a , float b) {
		return a+b;
	}
	
	
	//check if a number is Prime or not
	
	// 1) 2 to (n-1) method
	// for n>=1 
	/*public static boolean isPrime(int n) {
		// corner cases
		//2
		if(n==2) {
			return true;
		}
		for(int i = 2; i<=(n-1); i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}*/
	
	// 2 to root(n) method
	
      public static boolean isPrime(int n) {
	//Corner cases
    //2
		if(n==2) {
			return true;
		}
	   for(int i = 2; i<=Math.sqrt(n); i++) {
		   if(n%i==0) {
			   return false;   
		   }
		}
		return true;
	}
	
	//Print all Primes in a Range
		public static void primeInRange(int n) {
			for(int i = 2; i<=n; i++) {
				if(isPrime(i)) {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
		
		public static void binToDec(int binNum) {
			int myNum = binNum;
			int pow = 0;
			int dec= 0;
			while(binNum>0) {
				int lastDigit = binNum%10;
				dec += lastDigit*Math.pow(2, pow);
				pow++;
				binNum /= 10;
			}
			System.out.println("the decimal of "+myNum+" is "+dec);
		}
		
		public static void decToBin(int decNum) {
			int myNum = decNum;
			int pow = 0;
			int binNum = 0;
			while(decNum>0) {
				int rem = decNum%2;
				binNum += rem*Math.pow(10, pow);
				pow++;
				decNum/=2;
			}
			System.out.println("the binary of "+myNum+" is "+binNum);
		}
		
		
		
		// Functions Questions
		
		
		// 1) Write a Java method to compute the average of three numbers.
		
		public static float average(float a, float b, float c) {
			float aver = (a+b+c)/3;
			return aver;
		}
		
		public static boolean isEven(int n) {
			if(n%2==0) {
				return true; 
			}else {
				return false;
			}
			
		}
		
		public static int checkReverse(int n) {
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
			return rev;
		}
		
		public static void checkPalindrome(int n) {
			int rev = checkReverse(n);
			System.out.print(rev+" is the reverse of the number ");
			if(n==rev) {
				System.out.println("therefore "+n+" is a palindrome number");
			}else {
				System.out.println("therefore "+n+" is not a palindrome number");
			}
		}
		
		
	public static void sumOfDigit(int n) {
		int sum = 0;
		while(n>0) {
			int lastDigit = n%10;
			sum += lastDigit;
			n/=10;
		}
		System.out.println("sum of digits is "+sum);
	}
		
		
		
		
	}



	


