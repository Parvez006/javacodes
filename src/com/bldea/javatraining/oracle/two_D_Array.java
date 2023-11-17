package com.bldea.javatraining.oracle;
import java.util.*;
public class two_D_Array {
	
	public static boolean search(int matrix[][],int key) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j]==key) {
					System.out.println("the key is in"+"("+i+","+j+")");
					return true;
				}
			}
		}
		System.out.println("the key is not found");
		return false;
	}
	
	public static void spiralmatrix(int matrix[][]) {
		int startRow = 0;
		int startCol = 0;
		int endRow = matrix.length-1;
		int endCol = matrix[0].length-1;
				while(startRow<=endRow && startCol<=endCol) {
					//top
					for(int j=startCol; j<=endCol; j++) {
						System.out.print(matrix[startRow][j]+" ");
					}
					//left
					for(int i=startRow+1; i<=endRow; i++) {
						System.out.print(matrix[i][endCol]+" ");
					}
					//bottom
					for(int j=endCol-1; j>=startCol; j--) {
						if(startRow==endRow) {
							break;
						}
						System.out.print(matrix[endRow][j]+" ");
					}
					//right
					for(int i=endRow-1; i>=startRow+1; i--) {
						if(startCol==endCol) {
							break;
						}
						System.out.print(matrix[i][startCol]+" ");
					}
					startRow++;
					endRow--;
					startCol++;
					endCol--;
				}
				System.out.println();
			}
	
	
	public static void diagonalsum(int matrix[][]) {
		int sum = 0;
		
		//brute force
		
		/*for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(i==j) {
					sum += matrix[i][j];
				}
				else if(i+j == matrix.length-1) {
					sum += matrix[i][j];
				}
			}
		}
		*/
		
		// optimize method
		
		for(int i=0; i<matrix.length; i++) {
			// PD
			sum += matrix[i][i];
			
			// SD
			if(i!=matrix.length-1-i) {
				sum += matrix[i][matrix.length-1-i];
			}
		}
		System.out.println("the sum of diagnols is "+sum);
	}
	
	public static void staircasesearch(int matrix[][] , int key) {
		
		// solved by two approaches
		
		// 1) by using (0,m-1)
		/*int row = 0 , col = matrix[0].length-1;
		while(row < matrix.length &&  col >= 0) {
			if(matrix[row][col] == key) {
				System.out.println(" the key is in index "+ "(" + row + "," + col + ")");
			break;
			}
			else if(matrix[row][col]> key) {
				col--;
			}
			else {
				row++;
			}
		}*/
		
		
		//2) by using (n-1 , 0)
         int row = matrix.length-1 , col = 0;
         while(row>=0 && col<matrix[0].length) {
        	 if(matrix[row][col] == key) {
 				System.out.println(" the key is in index "+ "(" + row + "," + col + ")");
 			break;
 			}
 			else if(matrix[row][col]> key) {
 				row--;
 			}
 			else {
 				col++;
 			}
         }
	}
		
	
	public static int printNumber(int numbers[][], int key) {
		int count = 0;
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[0].length; j++) {
				if(numbers[i][j]==key) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int sumOfNumbers(int numbers[][]) {
		int sum = 0;
		int row = 1;
		for(int col=0; col<numbers[0].length; col++) {
			sum += numbers[row][col];
		}
		return sum;
	}
	
	public static void printMatrix(int numbers[][]) {
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[0].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		/*int matrix[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		//output
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		//search
		search(matrix,5);*/
	
		//Spiral Matrix
		
		int matrix[][] = {{1,2,3,4},
				          {5,6,7,8},
				          {9,10,11,12},
				          {13,14,15,16}};
		//spiralmatrix(matrix);
		
		//diagonalsum(matrix);
		
		//staircasesearch(matrix,14);
		
		// print number of times the number appeared
		
		/*int numbers[][] = {{4,7,8},{8,8,7}};
		int count = printNumber(numbers,8);
		if(count==0) {
			System.out.println("number not once occured");
		}else {
			System.out.println("the number occured "+count+" times");
		}*/
		
		
		// sum of second row of matrix
		
		/*int numbers[][] = {{1,4,9,2},
				           {11,5,3,6},
				           {2,2,3,6}};
		int sum = sumOfNumbers(numbers)
		System.out.println("the sum of second row is "+sum);*/
		
		
		// transpose of matrix
		
		
		int numbers[][] = {{2,3,7,5},{5,6,7,3}};
		int row = numbers.length, col = numbers[0].length;
		// Display original matrix
		printMatrix(numbers);
		
		// Transpose the matrix
		int transpose[][] = new int[numbers[0].length][numbers.length];
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				transpose[j][i] = numbers[i][j];
			}
			System.out.println();
		}
		
		printMatrix(transpose);
		
		
		
		
	}
}
