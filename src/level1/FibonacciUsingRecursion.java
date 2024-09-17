package level1;

import java.util.Scanner;
//fibonacci numbers - 0 1 1 2 3 5 8 13 21 34 .....
public class FibonacciUsingRecursion {

    public static long nthFibonacciNumber(int number) {
        if(number <= 2)
            return number-1;
        return nthFibonacciNumber(number - 1) + nthFibonacciNumber(number - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        if(number > 0)
            System.out.println(number+"th fibonacci number is "+nthFibonacciNumber(number));
        else
            System.out.println("Please enter a number greater than 0");
        sc.close();
    }
}
