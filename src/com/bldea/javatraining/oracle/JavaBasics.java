package com.bldea.javatraining.oracle;
import java.util.Scanner;
public class JavaBasics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte b = 12;
		short s = 34;
		char c = 'E';
		int a = c;
		System.out.println(a);
		double d = 1234.432;
		int x = (int)(b+s+c+d);
		System.out.println(x);
	}
}
