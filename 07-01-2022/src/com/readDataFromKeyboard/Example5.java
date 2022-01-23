package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example5 
{
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the length");
	
	double l= scanner.nextDouble();

	System.out.println("Enter the breath");
	
	double b= scanner.nextDouble();
	
	double area=l*b;
	
	System.out.println("Area of Rectangle is: " + area);
	
	scanner.close();
	}

}
