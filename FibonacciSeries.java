package com.bridgelab.practice;

import java.util.Scanner;

public class FibonacciSeries {
	public static void fibonacciSeries() {
		//local variables
		int n,n1=0,n2=1,n3;
		System.out.println("Enter how many terms you want to print : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		//computation
		System.out.print(n1+" "+n2);
		for(int i=2;i<n;++i) {
			n3=n2+n1;
			System.out.print(" "+n3);
			n1=n2; 
			n2=n3;
		}
		sc.close();
	}

	public static void main(String[] args) {
		fibonacciSeries();
	}
}
