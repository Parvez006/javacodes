package com.bldea.javatraining.oracle;

public class Arrays_Assignment {
	public static boolean sameordiff(int nums[]) {
		boolean issame = false;
		int number = 0;
		for(int i=0; i<nums.length; i++) {
			number = nums[i];
			int k = i;
			for(int j=0; j<nums.length; j++) {
				if(k==j) {
					continue;
				}
				if(number==nums[j]) {
					issame = true;
				}
			}
		}
		return issame;
	}
	
	public static int findoutindex(int nums[] , int target) {
		int isvalue = -1;
		for(int i=0; i<nums.length; i++) {
			if(target==nums[i]) {
				isvalue = i;
			}
		}
		return isvalue;
	}
	
	public static int buyandsell(int prices[]) {
		int buyingprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for(int i=0 ; i<prices.length; i++) {
			if(buyingprice < prices[i]) {
			int	profit = prices[i] - buyingprice;
			maxprofit = Math.max(maxprofit, profit);
			}else {
				buyingprice = prices[i];
			}
		}
		return maxprofit;
	}
	
	public static int trappedwater(int height[]) {
		int trappedwater = 0;
		int width = 1;
		int n = height.length;
		//max left boundary
		int maxleft[] = new int[n];
		maxleft[0] = height[0];
		for(int i=1; i<n; i++) {
			maxleft[i] = Math.max(maxleft[i-1], height[i]);
		}
		//max right boundary
		int maxright[] = new int[n];
		maxright[n-1] = height[n-1];
		for(int i=n-2; i>=0; i--) {
			maxright[i] = Math.max(maxright[i+1], height[i]);
		}
		//water level
		for(int i=0; i<n; i++) {
			int waterlevel = Math.min(maxright[i],maxleft[i]);
			trappedwater += (waterlevel-height[i])*width;
		}
		//trapped water
		return trappedwater;
		
	}
	
	
	public static void triplets(int nums[]) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				for(int k=j+1; k<nums.length; k++) {
					if(nums[i]+nums[j]+nums[k]==0) {
						System.out.print("("+nums[i]+","+nums[j]+","+nums[k]+") ");
					}
				}
			}
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) {
		// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		//int nums[] = {1,1,1,3,3,4,3,2,4,2};
		//System.out.println(sameordiff(nums));
		
		// Given the array nums after the possible rotation and an interger target, return the index of target if it is in nums , or -1 if it is not in nums.
		//int nums[] = {1};
		//int target = 0;
		//System.out.println(findoutindex(nums,target));
		
		// you are given an array prices where prices[i] is the prices of a given stock on the ith day
		//int prices[] = {7,6,4,3,1};
		//int maxprofit = buyandsell(prices);
		//System.out.println(maxprofit);
		
		// Given n non-negative integers representing an elevation map where the width of each bar is 1; compute how much water it can trap after raining
		int height[] = {4,2,0,3,2,5};
		System.out.println(trappedwater(height));
		
		
		// 
		int nums[] = {-1,0,1,2,-1,-4};
		triplets(nums);
		
	}

}
