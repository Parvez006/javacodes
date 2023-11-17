package com.bldea.javatraining.oracle;
import java.util.*;
public class Strings {
	
	public static void printchar(String str) {
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
		System.out.println();
	}
	
	
	public static boolean isPalindrome(String str) {
		int n = str.length();
		for(int i=0; i<n/2; i++) {
			if(str.charAt(i) != str.charAt(n-1-i)) {
				// not a Palindrome
				return false;
			}
		}
		return true;
	}
	
	public static float getShortestpath(String str) {
		int x=0 , y=0;
		for(int i=0; i<str.length(); i++) {
			char d = str.charAt(i);
			if(d=='N') {
				y++;
			}
			else if(d=='S') {
				y--;
			}
			else if(d=='E') {
				x++;
			}
			else {
				x--;
			}
		}
		int X2 = x*x;
		int Y2 = y*y;
		return (float)Math.sqrt(X2+Y2);
	}
	
	
	public static String substring(String str,int si, int ei) {
		String str1 = "";
		for(int i=si; i<ei; i++) {
			str1 += str.charAt(i);
		}
		return str1;
	}
	
	
	public static String convertUppercase(String str) {
		StringBuilder sb = new StringBuilder("");
		char ch = Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		for(int i=1; i<str.length(); i++) {
			if(str.charAt(i)==' ' && i<str.length()-1) {
				sb.append(str.charAt(i));
				i++;
				ch = Character.toUpperCase(str.charAt(i));
				sb.append(ch);
			}else {
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
	
	
	public static String stringCompressed(String str) {
		StringBuilder sb = new StringBuilder("");
		for(int i=0; i<str.length(); i++) {
			Integer count = 1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
				count++;
				i++;
			}
			sb.append(str.charAt(i));
			if(count>1) {
				sb.append(count);
			}
		}
		return sb.toString();
	}
	
	public static void countVowels(String str) {
		int count = 0;
		String str1 = "aeiou";
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str1.length(); j++) {
				if(str.charAt(i)==str1.charAt(j)) {
					count++;
				}
			}
		}
		System.out.println("the number of vowels in a text is "+count);
	}
	
	public static boolean anagrams(String str1 , String str2) {
		// covert the strings into lowercase
		str1.toLowerCase();
		str2.toLowerCase();
		// check the length
		if(str1.length()!=str2.length()) {  
			return false;
		}
			// convert strings into char arrays
			char str1toch[] = str1.toCharArray();
			char str2toch[] = str2.toCharArray();
			
			// sort the arrays
			Arrays.sort(str1toch);
			Arrays.sort(str2toch);
			
			// if arrays are identical then their anagrams
			boolean result = Arrays.equals(str1toch, str2toch);
		return result;
	}
	
	public static void main(String[] args) {
		/*String str = "abcd@#$$";
		String str2 = new String("122we23323@#");
		//Scanner sc = new Scanner(System.in);
		//String str3 = sc.nextLine();
		String str4 = "Tony Starc";
		System.out.println(str4.length());
		String s = "absx";
		String q = "qwidb";
		String f = s+" "+q;
		System.out.println(f.charAt(0));
		
		printchar(f);*/
		
		// Palindrome 
		/*String str = "racecar";
		boolean b = isPalindrome(str);
		
		if(b==true) {
			System.out.println("it is a palindrome");
		}else {
			System.out.println("it is not a palindrome");
		}*/
		
		// finding the shortest path
		//String str = "WNEENESENNN";
		//System.out.println(getShortestpath(str));
		
		// String Comparison
		/*String s1 = "PARVEZ";
		String s2 = "PARVEZ";
		String s3 = new String("PARVEZ");
		
		if(s1==s2) {
			System.out.println("the strings are equal");
		}else {
			System.out.println("the strings are not equal");
		}
		
		if(s1.equals(s3)) {
			System.out.println("the strings are equal");
		}else {
			System.out.println("the strings are not equal");
		}*/
		
		
		
		//substring
		/*String str = "HELLOWORLD";
		System.out.println(substring(str, 0, 5));
		System.out.println(str.substring(0,5));
		*/
		
		
		//Finding the largest string
		/*String fruits[] = {"apple","mango","banana","strawberry"};
		String largest = fruits[0];
		for(int i=1; i<fruits.length; i++) {
			if(largest.compareToIgnoreCase(fruits[i])<0) {
				largest = fruits[i];
			}
		}
		System.out.println(largest);*/
		
		// StringBuilder
		/*StringBuilder sb = new StringBuilder("");
		for(char ch='a'; ch<='z'; ch++) {
			sb.append(ch);
		}
		System.out.println(sb);
		System.out.println(sb.length());*/
		// TC = O(26);
		
		//Convert the first letter of each word to Uppercase
		/*String str = "hi, i am md parvez";
		System.out.println(convertUppercase(str));*/
		
		//String Compression TC=O(n)
		//String str = "aaabbcccc";
		//System.out.println(stringCompressed(str));
		
		
		
		
		//Home Work
		
		
		//1) Count how many times lowercase vowels occured in a String by the user.
		//String str = "hi, i am parvez of karnataka";
		//countVowels(str);
		
		
		// 2) What will be the output of the following code?
		
		/*String str = "ShradhaDidi";
		String str1 = "ApnaCollege";
		String str2 = "ShradhaDidi";
		System.out.println(str.equals(str1)+" "+str.equals(str2));*/
		
		
		// 3)What will be the output of the following code?
		
		//String str = "ApnaCollege".replace("l"," ");
		//System.out.println(str);
		
		
		//4) Determine if 2 Strings are anagrams odf each other
	    String str1 = "race";
		String str2 = "care";
		if(anagrams(str1 , str2)) {
			System.out.println(str1+" & "+str2+" are anagrams to each other");
		}else {
			System.out.println(str1+" & "+str2+" are not anagrams to each other");
		}
		
		
		
		// intern()
		/*String str1 = "Hello";
		String str2 = new String("Hello").intern();
		System.out.println(str1==str2);*/
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
