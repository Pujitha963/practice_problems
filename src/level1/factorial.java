package level1;

import java.util.Scanner;

public class Factorial {
	public static long fact(int number) {
		long factorialValue = 1;
		for(int i = 2;i <= number;i ++) {
			factorialValue *= i;
		}
		return factorialValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		if(number >= 0)
			System.out.printf("Factorial of %d is %d", number, fact(number));
		else
			System.out.println("Please enter number greater than or equal to 0");
		sc.close();
	}

}
