package com.swetha.practice.JavaPractice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=987654, reverse=0;
		while(number!=0)
		{
			int remainder=number%10;
			reverse=reverse*10+remainder;
			number=number/10;
			
		}
		System.out.println("reverse of given number is" +reverse);
		}

	}


