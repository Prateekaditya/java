// package Basics Recursion;

public class Fibonacii {

    public static int printFibonacci(int n) {
        if (n == 0 || n==1) {
            return n;
        }
        int f1= printFibonacci(n-1);
        int f2 =printFibonacci(n-2);
        return f1+f2;
        

    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(printFibonacci(n));
    }
}
