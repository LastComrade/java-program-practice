package com.deloitte.Basic;

import java.util.Scanner;

public class PrimeNumberChecker {
	public void solve(int number) {		
		boolean flag = false;
		
		if (number <= 1) {
			System.out.println("Not a prime number");
			return;
		}
		
		for (int i=2; i<Math.sqrt(number); i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		
		if (flag)
			System.out.println("Not a prime number");
		else 
			System.out.println("Prime number");
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int number = sc.nextInt();
			PrimeNumberChecker pnc = new PrimeNumberChecker();

			pnc.solve(number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
