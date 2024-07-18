package level1;

import java.util.Scanner;

public class factorialUsingRecursion {
	
	public static long fact(int n) {
		if(n == 0)
			return 1;
		else
			return n * fact(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextInt();
		if(n>=0)
			System.out.printf("Factorial of %d is %d", n, fact(n));
		else
			System.out.println("Please enter number greater than 0");
	}

}
