package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example3 

{

	public static void main(String[] args) 
	{
		String name;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter your name");
		name=scanner.nextLine();
		System.out.println(name);
		scanner.close();
		
	}

}
