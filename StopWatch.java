package com.bridgelab.practice;

import java.util.Scanner;

public class StopWatch {
	public static void computingStopWatch() {
		//local variables
		int count=0,count1=0,stop=1;
		Scanner sc=new Scanner(System.in);
		//computation
		while(count1<=12) {
			if(stop == 0)
				break;
			else {
				count++;//minute hand
				if(count == 60 || count == 120 || count == 180 || count == 240 || count == 300 || count == 360 || count == 420 || count == 480 || count == 540 || count == 600 || count == 660 || count == 720 )
				{
					count1++;//hour hand
					count=0;
				}
				stop=(int)((Math.random()*10)%10);
				//System.out.println("Enter stop value : ");
				//stop = sc.nextInt();
			}
		}
		System.out.println(count1+" hrs : "+count+" minutes");
		sc.close();
	}

	

	public static void main(String[] args) {
		computingStopWatch();
	}
}

