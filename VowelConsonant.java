package com.BridgeLabz;

import java.util.Scanner;

public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("enter the character");
		char ch = reader.next().charAt(0);
			
		
           if(ch == 'a' || ch == 'e'  || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("The given variable is Vowel");
		}
		else
		{
			System.out.println("The given variable is consonant");

	}

	}
}
