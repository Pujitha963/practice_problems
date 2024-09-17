package level1;

import java.util.Scanner;

//fibonacci numbers - 0 1 1 2 3 5 8 13 21 34 .....
class Fibonacci{
    public static long nthFibonacciNumber(int number) {
        long firstValue = 0, secondValue = 1, nextValue = firstValue + secondValue;
        if(number == 1)
            return 0;
        else {
            for(int i = 2; i < number; i++) {
                nextValue = firstValue + secondValue;
                firstValue = secondValue;
                secondValue = nextValue;
            }
        }
        return nextValue;
    }

    public static void main(String args[]) {
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