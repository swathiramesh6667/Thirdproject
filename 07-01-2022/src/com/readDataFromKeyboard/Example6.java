package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example6 
{
	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter the radius:");
		
		double r= scanner.nextDouble();
		
		double area=(22*r*r)/7;
		
		System.out.println("Area of circle is:" + area);
		
		scanner.close();
		
	}
}
