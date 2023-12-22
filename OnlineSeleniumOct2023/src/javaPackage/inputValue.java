package javaPackage;

import java.util.Scanner;

public class inputValue {

	public static void main(String[] args) 
	{
		System.out.println("Enter a Value");
		try (Scanner sc1 = new Scanner(System.in)) {
			String input=sc1.nextLine();
			System.out.println("Entered Value is:" +input);
		}
		;
		
	}

}
