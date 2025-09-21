package com.cjc;

import java.util.Scanner;

public class A 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("your age is valid for voting");
		}
		else
		{
			System.out.println("your age is not valid for voting");
		}
	}
}
