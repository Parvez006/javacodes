package com.bldea.javatraining.oracle;

public class Operators_in_Java {
	public static void main(String[] args) {
		//int A = 10;
		//int B = 5;
		//Arithmetic Operators
		//Binary
		/*System.out.println("Add = "+ (A+B));
		System.out.println("Subtract = "+ (A-B));
		System.out.println("Multiply = "+ (A*B));
		System.out.println("Divide = "+ (A/B));
		System.out.println("Modulo = "+ (A%B));*/
		//Unary
		/*int a = 10;
		int b = ++a;
		System.out.println(a);
				System.out.println(b);
				int c = 10;
				int d = c++;
				System.out.println(c);
				System.out.println(d);
				int e = 10;
				int f = --e;
				System.out.println(e);
				System.out.println(f);
				int g = 10;
				int h = g--;
				System.out.println(g);
				System.out.println(h);*/
		
		//Relational Operators
		/*int a = 10;
		int b = 5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);*/
		
		//Logical Operators
		/*System.out.println( (3>2) && (5<2) );
		System.out.println( (3>2) || (5<2) );
		System.out.println( !(3>2) );*/
		
		//Assignment Operators
		//int a = 20;
		//int b = a;
		//System.out.println(b);
		//a += 20; //a = a+20;
		//System.out.println(a);
		//a -= 10; // a = a-10;
		//System.out.println(a);
		//a *= 10; // a = a*10;
		//System.out.println(a);
		//a /= 10; // a = a/10;
		//System.out.println(a);
		//a %= 10; // a = a%10;
		//System.out.println(a);
		
		// Operators Questions
		//1)
		//int x=2 , y=5;
		//int exp1 = (x*y/x);
		//int exp2 = (x*(y/x));
		//System.out.print(exp1 + ",");
		//System.out.println(exp2);
		
		//2)
		/*int x = 200, y = 50, z = 100;
		if(x>y && y>z) {
			System.out.println("Hello");
		}
		if (z>y && z<x) {
			System.out.println("Java");
		}
		if ((y+200) < x && (y+150)< z) {
			System.out.println("Hello Java");
		}*/
		
		//3)
		//int x, y, z;
		//x = y = z = 2;
		//x += y;
		//y -= z;
		//z /= (x+y);
		//System.out.println(x + " " + y + " " + z);
		
		//4)
		//int x = 9, y = 12;
		//int a = 2, b = 4, c = 6;
		//int exp = 4/3 * (x+34) + 9 * (a+b*c) + (3 + y *(2+a))/(a + b*y);
		//System.out.println(exp);
		
		//5)
		int x,y;
		x = 10;
        y = 5;
        
        int exp1 = (y*(x/y+x/y));
        int exp2 = (y*x/y+y*x/y);
        
        System.out.println(exp1);
        System.out.println(exp2);
		
			
	}

}
