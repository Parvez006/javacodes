package com.bldea.javatraining.oracle;

import java.util.Arrays;
import java.util.Collections;

public class Sorting {
	public static int bubblesort(int nums[]) {
		for(int turn=0; turn<nums.length-1; turn++) {
			int swap = 0;
			for(int j=0; j<nums.length-1-turn; j++) {
				if(nums[j]>nums[j+1]) {
					//swap
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					swap ++;
				}
				}
			if(swap==0) {
				return 1;
			}
			}
		return 0;
		}
	
	public static void selectionsort(int nums[]) {
		for(int i=0; i<nums.length-1; i++) {
			int minpos = i;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[minpos]>nums[j]) {
					minpos = j;
				}
			}
			//swap
			int temp = nums[minpos];
			nums[minpos] = nums[i];
			nums[i] = temp;
		}
	}
	
	public static void insertionsort(int nums[]) {
		for(int i=1; i<nums.length; i++) {
			int temp = nums[i];
			int previndex = i-1;
			while(previndex>=0 && nums[previndex]>temp) {
				nums[previndex+1] = nums[previndex];
				previndex--;
			}
			// insertion sort
			nums[previndex+1] = temp;
		}
	}
	
	public static void countingsort(int nums[]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			largest = Math.max(largest, nums[i]);
		}
		int count[] = new int[largest+1];
		for(int i=0; i<nums.length; i++) {
			count[nums[i]]++;
		}
		int j=0;
		for(int i=0; i<count.length; i++) {
			while(count[i]>0) {
				nums[j] = i;
				j++;
				count[i]--;
			}
		}
	}
	
	public static void countingsortifnegativenums(int nums[]) {
		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<nums.length; i++) {
			largest = Math.max(largest, nums[i]);
			smallest = Math.min(smallest, nums[i]);
		}
		
		int count[] = new int[largest-smallest+1];
		for(int i=0; i<nums.length; i++) {
			count[nums[i]-smallest]++;
		}
		int j=0;
		for(int i=0; i<count.length; i++) {
			while(count[i]>0) {
				nums[j] = i+smallest;
				count[i]--;
				j++;
			}
		}
		
	}
	public static void main(String[] args) {
		/*int nums[] = {1,2,7,4,5};
		  int s = bubblesort(nums);
		  if(s==1) {
			  System.out.println("no sorting needed");
		  }else {
			  for(int i=0; i<nums.length; i++) {
					System.out.print(nums[i]+" ");
				}
		  }*/
	/*	int nums[] = {2,6,1,5,4};
		selectionsort(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}*/
		
		//Integer nums[] = {5,4,1,3,2};
		//System.out.println(nums.length);
	//	insertionsort(nums);
	
		
		// inbuilt sort
		
	/*	Arrays.sort(nums,0,4,Collections.reverseOrder());
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}*/
		
		// counting sort
		/*int nums[] = {1,4,1,3,2,4,3,7};	
		countingsort(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}*/
		
		
		// counting sort if their are negative numbers
		int nums[] = {-1,-2,4,3,-2,3,-1,5};
		countingsortifnegativenums(nums);
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		}
	}


