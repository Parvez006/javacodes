package com.bldea.javatraining.oracle;

public class DSA_Sheet {
	public static int tR(int height[]) {
		int n = height.length;
		int width = 1;
		int trappedwater = 0;
		// max left boundary
		int maxleft[] = new int[n];
		maxleft[0] = height[0];
		for(int i = 1; i<n; i++) {
			maxleft[i]= Math.max(maxleft[i-1], height[i]);
		}
		
		// max right boundary
		int maxright[] = new int[n];
		maxright[n-1] = height[n-1];
		for(int i=n-2; i>=0; i--) {
			maxright[i] = Math.max(maxright[i+1], height[i]);
		}
		
		// water level
		for(int i=0; i<n; i++) {
			int waterlevel = Math.min(maxleft[i], maxright[i]);
			trappedwater += (waterlevel-height[i])*width;
		}
		// trapped water
		return trappedwater;
	}
	
	public static int buyandsell(int price[]) {
		int buyingprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for(int i=0; i<price.length; i++) {
			if(buyingprice<price[i]) {
			int	profit = price[i] - buyingprice;
			maxprofit = Math.max(maxprofit, profit);
			}else {
				buyingprice = price[i];
			}
		}
		return maxprofit;
	}
	
	
	public static void main(String args[]) {
		
		// DSA question no 22 
		// Trapping Rainwater
		//int height[] = {4,2,0,6,3,2,5};
		//System.out.println("the total trapped water is "+tR(height));
		
		// buy and sell stocks
		int price[] = {7,1,5,3,6,4};
		System.out.println("the max profit is "+buyandsell(price));
		
		
	}

}
