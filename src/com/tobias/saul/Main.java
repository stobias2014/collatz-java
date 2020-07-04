package com.tobias.saul;

import java.util.Scanner;

// if number even print number / 2 and return this value
// if number is odd print and return 3 * number + 1
// 

public class Main {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner in = new Scanner(System.in);
		
		boolean isNumberOne = false;
		
		int number = in.nextInt();
		
		int result = Main.collatz(number);
		
		while(!isNumberOne) {
			result = Main.collatz(result);
			
			if (result == 1) {
				isNumberOne = true;
			}
		}
		
		in.close();
		
	}
	
	public static int collatz(int number) {
		
		int result = 0;
		
		if (number % 2 == 0) {
			// even
			result = number / 2;
			System.out.println(result);
		} else if (number % 2 > 0) {
			// odd
			result = 3 * number + 1;
			System.out.println(result);
		}
		
		return result;
	}

}
