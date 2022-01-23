package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{
		
		int num1;
		int num2;
		
		int sum;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter first value: ");
		num1= scanner.nextInt();
		
		System.out.println("Enter second value: ");
		num2= scanner.nextInt();
		sum = num1+num2;
		System.out.println("===========");
		System.out.println(sum);
		scanner.close();
		
	}

}
