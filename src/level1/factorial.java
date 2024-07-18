package level1;

import java.util.Scanner;

public class factorial {
	public static long fact(int n) {
		long f = 1;
		if(n == 0)
			return f;
		for(int i=2;i<=n;i++) {
			f *= i;
		}
		return f;
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
