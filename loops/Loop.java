import java.util.*;
public class Loop{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
 
               // sum of n number
        // System.out.println("Enter the number until which you have to print:");
        // int a=sc.nextInt();
        // int i=1;
        // int z=0;
        // while(i<=a){
        //     z=z+i;
        //     System.out.println("The number is : "+z);
        //     i++;
        // }    
        //print n numbers
        // System.out.println("Enter the number until which you have to print:");
        // int a=sc.nextInt();
        // int i=1;
        // while(i<=a){
        //     System.out.println("The number is : "+i);
        //     i++;
        //reverse a number and print it
        // System.out.println("Enter the number which you want to reverse:");
        // int a=sc.nextInt();
        // while (a>0){
        //     int lastdigit =a%10;
        //     System.out.print(lastdigit);
        //     a =a/10;

        // }
        //reverse and store
        //    System.out.println("Enter the number which you want to reverse:");
        // int a=sc.nextInt();
        // int num=a;
        // int rev=0;
        // while (a>0){
        //     int lastdigit =a%10;
        //     rev =(rev*10)+lastdigit;
        //     a =a/10;

        // }
        // System.out.println("rev is: "+rev);
        // if (rev==num){
        //     System.out.println("Palindrome");
        // }
        // else{
        //     System.out.println("Not Palindrome");
        // }
        do{ int a=sc.nextInt();
            if(a%10==0){
                System.out.println("Multiple of 10");
                break;
            }
           
            System.out.println(a);
        }while(true);
               } 
            }