package com.bridgelab.practice;

import java.util.Scanner;

public class PerfectNumber {
	public static void isPerfectNumber() {
		//local variable
		int sum=0;
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//computation
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(n == sum)
			System.out.println("congrats!! entered number is a perfect number .");
		else
			System.out.println("Entered number is not a perfect number.");
		sc.close();
	}

	public static void main(String[] args) {
		isPerfectNumber();
	}

}
