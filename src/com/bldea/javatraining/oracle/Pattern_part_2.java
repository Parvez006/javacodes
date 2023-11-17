package com.bldea.javatraining.oracle;

public class Pattern_part_2 {
	public static void main(String[] args) {
		butterfly_pattern(6);
	
		
		// INVERTED HAIF-PYRAMID with number pattern
	/*	int n = 5;
		int number = 1;
		for (int line = 1; line<=n; line++) {
			for(int i=1; i<=line; i++) {
				System.out.print(number +" ");
				number++;
			}
			System.out.println();
		}*/
	}
	
	// print Hollow Rectangle pattern
	public static void printHallow(int rows, int columns) {
		// outer loop
		for(int i=1; i<=rows; i++) {
			// inner loop
			for(int j = 1; j<=columns ; j++) {
				// Boundary check
				if(i==1 || i==rows || j==1 || j==columns) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	
	public static void InvRotHalfPyr(int n) {
		for(int i =1; i<= n; i++) {
			for(int j = 1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void invHalfPyramid(int n) {
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void floydsTriangle(int n) {
		int count = 1;
		for(int i = 1; i<= n ; i++) {
			for(int j = 1; j<= i; j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
	
	public static void zero_one_triangle(int n) {
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j<= i; j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}else {
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
	
	public static void butterfly_pattern(int n) {
		for(int i = 1; i<= n; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=1; j<=2*(n-i); j++) {
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =1; i<= n; i++) {
			for(int j =1; j<= n-i+1; j++) {
				System.out.print("*");
			}
			for(int j = 1; j<= 2*(i-1); j++) {
				System.out.print(" ");
			}
			for(int j =1; j<= n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	// Solid Rhombus
	public static void solidRhombus(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	//Hollow Rhombus
	public static void hollowRhombus(int n) {
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n; j++) {
				if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	//Diamond Pattern
	public static void diamondPattern(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
