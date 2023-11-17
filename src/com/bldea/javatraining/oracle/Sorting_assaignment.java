package com.bldea.javatraining.oracle;

public class Sorting_assaignment {
	
	public static void Bubblesorting(int nums[]) {
		for(int turn=0; turn<nums.length-1; turn++) {
			for(int j=0; j<nums.length-1-turn; j++) {
				if(nums[j]<nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
	}
	
	public static void Selectionsort(int nums[]) {
		for(int i=0; i<nums.length-1; i++) {
			int maxpos = i;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[maxpos]< nums[j]) {
					maxpos = j;
				}
				// swap 
				int temp = nums[i];
				nums[i] = nums[maxpos];
				nums[maxpos] = temp;
			}
		}
	}
	
	public static void Insertionsort(int nums[]) {
		for(int i=1; i<nums.length; i++) {
			int curr = nums[i];
			int previndex = i-1;
			while(previndex>=0 && nums[previndex]<curr) {
				nums[previndex+1] = nums[previndex];
				previndex--;
			}
			nums[previndex+1] = curr;
		}
	}
	
	public static void Countingsort(int nums[]) {
		int largest = Integer.MIN_VALUE;
		for(int i=0; i<nums.length; i++) {
			largest = Math.max(largest,nums[i]);
		}
		int count[] = new int[largest+1];
		for(int i=0; i<nums.length; i++) {
			count[nums[i]]++;
		}
		int j=0;
		for(int i=count.length-1; i>=0; i--) {
			while(count[i]>0) {
				nums[j] = i;
				count[i]--;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {
		
		// Use the following sorting algorithms to sort an array in DESCENDING order:
		int nums[] = {1,2,3,4,5,6,7};
		
		// a. Bubble sort
		//Bubblesorting(nums); 
		
		// b. Selection sort
		//Selectionsort(nums);
		
		// c. insertion sort
		//Insertionsort(nums);
		
		// d. counting sort
		Countingsort(nums);
		
		
		
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
		
		
		
		
	}

}
