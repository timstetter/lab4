package lab4;

import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String userResponse = "y";
		System.out.println("Learn your Squares and Cubes!\n");
				
		do {
			System.out.print("Enter and integer: \n");
			int userInput = scnr.nextInt();
			System.out.printf("%-10s %-10s %-10s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s\n", "=======", "=======", "======");
			for (int i = 1; i <= userInput; i ++) {
				System.out.printf("%7s %10s %9s\n", i, i*i, i*i*i);
			}
			
			System.out.println("Multiplication Table for " + userInput);
			
			System.out.format("      ");
			for (int i = 1; i <= userInput; i++) {
				System.out.format("%4d", i);
			}
			System.out.println();
			System.out.println("***************************************");
			
			
			for (int i = 1; i <= userInput; i++) {
				System.out.format("%4d |", i);
				for (int j = 1; j <= userInput; j++) {
					System.out.printf("%4d", (i * j));
				}
				System.out.println();
			}
			
			System.out.println("Would you like to continue? (y/n)");
			userResponse = scnr.next();
			
		} while (userResponse.equals("y"));
		
		System.out.println("Goodbye!");
		
		
		
		scnr.close();

	}

}
