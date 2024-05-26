import java.util.*;
public class Pattern{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of lines to be printed:");
        int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<i+1;j++){
        //         System.out.print("x");
        //     }
        //     System.out.println(" ");
        // }
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=(n-i+1);j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        // for(int i = 1 ; i <= n ; i++){
        //     for(int j =1 ; j <= i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println(" ");
        // }
        char ch='A';
        for (int i =1; i<=n; i++){
            for (int j =1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println(" ");
        }
    }
}