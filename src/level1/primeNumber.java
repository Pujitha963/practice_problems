package level1;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int number) {
		if(number < 2)
			return false;
		for(int i=2; i <= Math.sqrt(number); i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		number = sc.nextInt();
		if(isPrime(number))
			System.out.printf("%d is a prime number", number);
		else
			System.out.printf("%d is not a prime number", number);
		sc.close();
	}

}
