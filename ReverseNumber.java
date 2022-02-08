package com.bridgelab.practice;

import java.util.Scanner;

public class ReverseNumber {
	public static void checkNumberIsReverse() {
		//local variables
		int n,temp,rem,rev=0;
		System.out.println("Enter any number : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//computation
		temp=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(temp == rev)
			System.out.println("both are same");
		else
			System.out.println("both are different");
		sc.close();
	}
	public static void main(String[] args) {
		checkNumberIsReverse();
	}
}