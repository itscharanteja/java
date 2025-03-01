import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the value of n: ");
int n = sc.nextInt();

    // Using recursive function
    System.out.println("Fibonacci number using recursive function: " + fibonacciRecursive(n));

    // Using non-recursive function
    System.out.println("Fibonacci number using non-recursive function: " + fibonacciNonRecursive(n));
}

public static int fibonacciRecursive(int n) {
    if (n <= 0) {
        return 0;
    } else if (n == 1 || n == 2) {
        return 1;
    } else {
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}

public static int fibonacciNonRecursive(int n) {
    if (n <= 0) {
        return 0;
    } else if (n == 1 || n == 2) {
        return 1;
    } else {
        int fib = 1;
        int prevFib = 1;
        for (int i = 3; i <= n; i++) {
            int temp = fib;
            fib = fib + prevFib;
            prevFib = temp;
        }
        return fib;
    }
}
}