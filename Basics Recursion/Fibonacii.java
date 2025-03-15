// package Basics Recursion;

public class Fibonacii {

    public static void printFibonacci(int n) {
        int value;
        if (n == 0) {
            n= 0;
            return;
        }
        int store=printFibonacci (n - 1)
       value= n + store ;
        System.out.println(value);
        

    }

    public static void main(String[] args) {
        int n = 10;
        printFibonacci(n);
    }
}
