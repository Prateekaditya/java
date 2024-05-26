import java.util.*;
public class Functions{
    // public static int pro(int num1,int num2){
    //     int product=num1*num2;
    //     return product;
    // }
    public static int fact(int n){
        int store=1;
        for(int i=1;i<=n;i++){
          store=store*i;
        }
        return store;
    }
    public static int binomial(int n,int r){
        int a=fact(n);
        int b=fact(r);
        int c=fact(n-r);
        int bin=a/(b*c);
        return bin;
    }
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        else{
            for (int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                    
                }
            }
            return true;
        }
    }
    public static void primeRange(int n){
        for(int i=2 ;i<=n;i++){
            if (isPrime(i)){
                System.out.print(i+ " ");
            }
        }
        System.out.println(" ");
    }
    public static void binToDec(int binnum){
        int mynum=binnum;
        int pow=0;
        int dec=0;
        while(binnum>0){
            int ld =binnum%10;
            dec=dec+(ld*(int)Math.pow(2,pow));
            binnum =binnum/10;
            pow++;
        }
        System.out.println("The binary number is "+mynum+ " the decimal number is "+dec);
    }
    public static void decToBin(int n){
        int pow=0;
        int bin=0;
        int mynum=n;
        while(n>0){
            int rem = n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            n=n/2;
            pow ++;
        }
        System.out.println("The decimal number is "+mynum+ " to binary number is "+bin);

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        // int product= pro(a,b);
        // int binc= binomial(a,b);
        //  System.out.println("factorial is is: "+binc);
        // System.out.println("number is prime or not:" +isPrime(a));
        // primeRange(a);
        binToDec(a);
        decToBin(b);
    }
}