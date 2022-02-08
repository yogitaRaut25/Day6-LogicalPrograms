package com.bridgelab.practice;

import java.util.Scanner;

public class PrimeNumber {
	public static void checkPrimeNumber() {
		//local variables
		int n, isPrime=1;
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//computation
		for(int i=2;i<n;i++) {
			if(n%i==0)
			{
				isPrime=0;
				break;
			}
		}
		if(isPrime==1)
			System.out.println("Entered no. is a prime no. : "+n);
		else
			System.out.println("Entered no. is NOT a prime no. : "+n);
		sc.close();
	}

	public static void main(String[] args) {
		checkPrimeNumber();
	}

}
