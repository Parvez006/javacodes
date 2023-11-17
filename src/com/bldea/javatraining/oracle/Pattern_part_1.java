package com.bldea.javatraining.oracle;

public class Pattern_part_1 {
	public static void main(String[] args) {
		
		// print Star pattern
		/*for(int line=1; line<=4; line++){
			for(int star=1; star<=line; star++) {
				System.out.print("*");
			}
			System.out.println();
	}*/
		
		// print inverted star pattern
		/*int n = 10;
		for(int line=1; line<=n; line++) {
			for(int star=1; star<=(n-line+1); star++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		// Print HALF-PYRAMID pattern
		/*int n = 4;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		// Print CHARACTER pattern
		int n = 4;
		char ch = 'A';
		for(int line = 1; line<=n; line++) {
			for( int i = 1; i<=line; i++) {
				System.out.print(ch);
				ch++;
			}
			System.out.println();
		}
		
	}
}
