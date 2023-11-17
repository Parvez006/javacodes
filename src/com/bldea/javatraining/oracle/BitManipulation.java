package com.bldea.javatraining.oracle;

public class BitManipulation {
	public static void checkODDorEVEN(int n) {
		int bitmask = 1;
		if((n & bitmask)==0) {
			// n is even
			System.out.println("it is a even number");
		}else {
			// n is odd
			System.out.println("it is a odd number");
		}
	}
	
	public static void get_ith_bit(int n,int i) {
		int bitmask = (1<<i);
		if((n & bitmask) == 0) {
			// the number at ith is 0
			System.out.println("the number is 0");
		}else {
			// the number at ith is 1
			System.out.println("the number is 1");
		}
	}
	
	public static int set_ith_bit(int n, int i) {
		int bitmask = 1<<i;
		 return n|bitmask;
	}
	
	public static int Clear_ith_bit(int n, int i) {
		int bitmask = ~(1<<i);
		
		return n & bitmask;
	}
	
	public static int update_ith_bit(int n, int i, int newBit) {
		// simple
		/*if(newBit==0) {
			return Clear_ith_bit(n,i);
		}else {
			return set_ith_bit(n, i);
		}*/
		
		// little deep
	     n = Clear_ith_bit( n, i);
	     int bitmask = newBit<<i;
	     return n|bitmask;
	}
	
	public static int Clear_last_i_bits(int n , int i) {
		int bitmask = (~0)<<i;
		return n & bitmask;
	}
	
	public static int Clear_Range_of_bits(int n, int i, int j) {
		int a = (~0)<<(j+1);
		int b = (1<<i)-1;
		int bitmask = a|b;
		return n & bitmask;
	}
	
	public static boolean isPowerof2(int n) {
		 return (n & (n-1))==0;
	}
	
	
	public static void countSetBits(int n) {
		int count = 0;
		while(n>0) {
			if((n & 1) != 0) {
				count++;
			}
			n= n>>1;
		}
		System.out.println("the number of sets bits are "+count);
	}
	
	
	public static int fastExponention(int n , int m) {
		int ans = 1;
		int a = n;
		while(m>0) {
			if((m & 1) != 0) {
				ans = ans*a;
			}
			a = a*a;
			m = m>>1;
		}
		return ans;
	}
	
	public static int modularExponention(int n , int m, int i) {
		return fastExponention( n ,  m) % i;
	}
	
	public static void swapwithoutthird(int a , int b) {
		System.out.println(a+" & "+b);
		// swap two numbers
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println(a+" & "+b);
	
	}
	
	public static int add1tointeger(int n) {
		/*int m = 1;
		while((n & m)>=1) {
			n ^= m;
			m <<= 1;
		}
		n ^= m;
		return n;*/
		
		return -(~n);
	}

	
	public static void main(String[] args) {
		
		//Bitwise AND operator (&)
		System.out.println(5&6);
		
		//Bitwise OR operator (|)
		System.out.println(5|6);
		
		//Bitwise XOR operator (^)
		System.out.println(5^6);
		
		//Bitwise One's Complement (~)
		System.out.println(~5);
		
		//Bitwise Left Shift (<<)
		System.out.println(5<<2);
		
		//Bitwise Right Shift (>>)
		System.out.println(6>>1);
		
		// Check if a number is odd or even
		checkODDorEVEN(3);
		checkODDorEVEN(12);
		checkODDorEVEN(27);
		
		//Get ith bit
		get_ith_bit(3,2);
		
		//set ith bit
		System.out.println(set_ith_bit(11 , 2));
		
		//Clear ith bit
		System.out.println(Clear_ith_bit(15, 2));
		
		//Update ith bit
		System.out.println(update_ith_bit(11, 2, 1));
		
		//Clear last i bits
		System.out.println(Clear_last_i_bits(15 , 2));
		
		//Clear range of bits
		System.out.println(Clear_Range_of_bits(10, 2, 7));
		
		//Check if a number is a Power of 2 or not
		System.out.println(isPowerof2(7));
		
		//Count Set bits in a Number
		countSetBits(15);
		
		//Fast Exponention
		System.out.println(fastExponention(5 , 3));
		
		//Modular Exponention
		System.out.println(modularExponention(3, 3, 5));
		
		
		
		
		// Home work
		
		
		//2) Swap two numbers without using any third variable.
		swapwithoutthird(5 , 6);
		
		//3) Add 1 to an integer using Bit manipulation
		System.out.println(add1tointeger(9));
		
		//4) Coversion of lowercase to uppercase using bits
		for(char ch='a'; ch<='z'; ch++) {
			System.out.print((char)(ch ^ ' ')+" ");
		}
		System.out.println();
		//5) Conversion of uppercase to lowercase using bits
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print((char)(ch | ' ')+" ");
		}
		
	}

}
