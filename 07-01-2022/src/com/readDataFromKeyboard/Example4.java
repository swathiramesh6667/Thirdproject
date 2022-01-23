package com.readDataFromKeyboard;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args)
	
	{
		
	String name;
	int age;
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter name");
	
	name=scanner.nextLine();
	
    System.out.println("age");
    
    age=scanner.nextInt();
    
    System.out.println("==============");
	
	System.out.println("Name:" + name);
	System.out.println("age:" + age);
	
    scanner.close();

	}

}
