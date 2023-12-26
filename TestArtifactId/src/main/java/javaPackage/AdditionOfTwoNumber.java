package javaPackage;

import java.util.Scanner;

public class AdditionOfTwoNumber {

	public static void main(String[] args) 
	{
	
		System.out.println("Enter value of i");
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		
		System.out.println("Enter value of j");
		
		int j=sc.nextInt();
		
		int k=i+j;
		
		
		System.out.println("Addition of i and j is:"+k);
		
	}

}
