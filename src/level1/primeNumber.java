package level1;

import java.util.Scanner;

public class primeNumber {
	
	public static boolean isPrime(int n) {
		if(n < 2)
			return false;
		for(int i=2; i <= Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		if(isPrime(n))
			System.out.printf("%d is a prime number", n);
		else
			System.out.printf("%d is not a prime number", n);

	}

}
