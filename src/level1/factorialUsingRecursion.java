package level1;

import java.util.Scanner;

public class FactorialUsingRecursion {
	
	public static long calculateFactorial(int number) {
		if(number == 0)
			return 1;
		else
			return number * calculateFactorial(number-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		if(number >= 0)
			System.out.printf("Factorial of %d is %d", number, calculateFactorial(number));
		else
			System.out.println("Please enter number greater than 0");
		sc.close();
	}

}
