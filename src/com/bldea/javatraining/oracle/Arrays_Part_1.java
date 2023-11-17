package com.bldea.javatraining.oracle;
import java.util.*;
public class Arrays_Part_1 {
	public static void update(int marks[],int number) {
		number += 1;
		for(int i=0; i<marks.length; i++) {
			marks[i] += 1;
		}
	}
	
	public static int linearSearch(int numbers[], int key) {
		for(int i=0; i<numbers.length; i++) {
			if(numbers[i]==key) {
			return i;
			}
		}
		return -1;
	}
	
	public static int linearSearch(String menu[],String key) {
		int count = 0;
		for(int i=0; i<menu.length; i++) {
			if(menu[i]==key) {
				
				return i;
			}
		}
		return -1;
	}
	public static int smallestNumber(int numbers[]) {
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<numbers.length; i++) {
			if(smallest>numbers[i]) {
				smallest = numbers[i];
			}
		}
		return smallest;
	}
	
	
	public static int largestNumber(int numbers[]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			if(largest<numbers[i]) {
				largest = numbers[i];
			}
		}
		return largest;
	}
	
	public static int binarySearch(int numbers[], int key) {
		int start = 0 , end = numbers.length-1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(numbers[mid]==key) {
				return mid;
			}
			else if(numbers[mid]<key) {
				start = mid+1;
			}
			else {
				end = mid-1;
			}
		}
		return -1;
	}
	
	
	
	public static void reverseArray(int numbers[]) {
		
		 int start = 0;
		 int end = numbers.length-1;
		while(start<end) {
			int temp = numbers[start];
			numbers[start] = numbers[end];
			numbers[end] = temp;
			start++;
			end--;
		}
		
	}
	
	public static void pairsArray(int numbers[]) {
		int numofpairs = 0;
		for(int i=0; i<numbers.length; i++) {
			int curr = numbers[i];
			for(int j=i+1; j<numbers.length; j++) {
				System.out.print("("+curr+","+numbers[j]+")");
				numofpairs++;
			}
			System.out.println();
		}
		System.out.println("numbers of pairs are "+numofpairs);
	}
	
	
	public static void subarrays(int numbers[]) {
		int total = 0;
		for(int i=0; i<numbers.length; i++) {
			int start = i;
			for(int j=i; j<numbers.length; j++) {
				int end = j;
			for(int k = start; k<=end; k++) {
				System.out.print(numbers[k]+" ");
			}
			total++;
			System.out.println();
			}
			System.out.println();
		}
		System.out.println("total subarrays is "+total);
	}
	
	
	public static void sumofsubarrays(int numbers[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<numbers.length; i++) {
			int start = i;
			for(int j=i; j<numbers.length; j++) {
				int sum = 0;
				int end = j;
			for(int k = start; k<=end; k++) {
				sum+=numbers[k];
				System.out.print(numbers[k]+" ");
			}
			if(largest<sum) {
				largest = sum;
			}
			if(smallest>sum) {
				smallest = sum;
			}
			System.out.print("the sum is "+sum);
			System.out.println();
			}
			System.out.println();
		}
		System.out.println("the largest sum is "+largest);
		System.out.println("the smallest sum is "+smallest);
	}
	
	
	public static void prefixMaxSum(int numbers[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		int currsum = 0;
		int prefix[] = new int[numbers.length];
		// prefix array
		prefix[0] = numbers[0];
		for(int i=1; i<prefix.length; i++) {
			prefix[i] = prefix[i-1]+numbers[i];
		}
		for(int i=0; i<numbers.length; i++) {
			int start = i;
			currsum = 0;
			for(int j=i; j<numbers.length; j++) {
				int end = j;
				currsum = start==0 ? prefix[end] : prefix[end]-prefix[start-1];
				System.out.println(currsum);
				if(largest<currsum) {
					largest = currsum;
				}
				if(smallest>currsum) {
					smallest = currsum;
				}
			}
			
			
		}
		System.out.println("the largest sum is "+largest);
		System.out.println("the smallest sum is "+smallest);
		
	}
	
	
	
	public static void kadanesAlgo(int numbers[]) {
		int count = 0;
		int cs = 0;
		int ms = Integer.MIN_VALUE;
		for(int i=0; i<numbers.length; i++) {
			cs += numbers[i];
			if(cs<0) {
				cs=0;
			}
			ms = Math.max(ms,cs);
			
		}
		System.out.println(ms);
	}
	
	
	

	public static void main(String[] args) {
		//int marks[] = new int[46];
		Scanner sc = new Scanner(System.in);
		/*marks[0] = sc.nextInt();
		marks[1] = sc.nextInt();
		marks[2] = sc.nextInt();
		System.out.println("the phy marks is "+marks[0]+"\nthe chem marks is "+marks[1]+" \nthe maths marks is "+marks[2]);
		marks[0]+=1;
		System.out.println("the phy marks is "+marks[0]);*/
		//System.out.println("the length of array is "+marks.length);
		/*int marks[] = {2,3,4};
		int number = 5;
		update(marks,number);
		for(int i=0; i<marks.length; i++) {
			System.out.print(" the marks "+marks[i]);
		}
		System.out.println("\n"+number);*/
		
	//	int numbers[] = {1,2,3,4,5,7,8};
		
	 	/*int key = 7;
		int index = linearSearch(numbers,key);
		if(index==-1) {
			System.out.println("not found");
		}else {
			System.out.println("the key index is "+index);
		}*/
		
		/*String menu[] = {"Dosa","pizza","samosa","frooti","coke"};
		String key = "pizza";
		
		int index = linearSearch(menu,key);
		if(index==-1) {
			System.out.println("not found");
		}else {
			System.out.println("the key index is "+index);
		}*/
		
		
		
		
		
		
		/*int numbers[] = {1,4,7,3,8,3};
		System.out.println("the largest value is "+largestNumber(numbers));
		System.out.println("the smallest value is "+smallestNumber(numbers));*/
		
		
		
		
		
		
		/*int numbers[] = {1,2,3,4,5,6,7};
		int key = 6;
		
		int index = binarySearch(numbers,key);
		if(index==-1) {
			System.out.println("not found");
		}else {
			System.out.println("the index of key is "+index);
		}*/
		
		
		
		
		
		// Reverse an Array
		
		//int numbers[] = {2,4,6,8,10};
		/*reverseArray(numbers);
		for(int i = 0; i<numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}*/
		//pairsArray(numbers);
		
		
		// Print Subarrays
		
		int numbers[] = {-1,-2,-6,-1,-3};
		kadanesAlgo(numbers);
		
	}
		}
