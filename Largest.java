package com.BridgeLabz;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner (System.in);
		System.out.println("Enter the value of n1 : ");
		System.out.println("Enter the value of n2 : ");
		System.out.println("Enter the value of n3 : ");
		int num1 = reader.nextInt();
		int num2 = reader.nextInt();
		int num3 = reader.nextInt();
		
		if(num1>num2 && num1>num3) 
		{
			System.out.println("Num1 is the Largest "+" and number is "+ num1);
			
		}
		else if (num2>num3)
		{
			System.out.println("Num2 is the Largest"+" and number is "+ num2);
		}
		else
		{
			System.out.println("Num3 is the Largest"+" and number is "+ num3);
		}
	}

	}


