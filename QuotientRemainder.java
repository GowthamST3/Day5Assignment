package com.BridgeLabz;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the value of dividend : ");
		System.out.println("Enter the value of divisor : ");
		int Dividend = reader.nextInt();
		int Divisor = reader.nextInt();
		
		int Quotient = Dividend/Divisor;
		int Remainder = Dividend%Divisor;
		
		System.out.println("Qoutient : "+Quotient);
		System.out.println("Remainder : "+Remainder);
	}

	}


