package com;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Calculator cal=new CalculatorImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers: ");

		int x=sc.nextInt();
		int y=sc.nextInt();

		cal.add(x, y);
		cal.mul(x, y);

		sc.close();
	}
}
