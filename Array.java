import java.util.*;
public class Array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ;
            System.out.println("The size of the array is :");
            int n= sc.nextInt();
            int marks[]=new int[n];
            for(int i=0;i<marks.length;i++){
                marks[i]=sc.nextInt();
                // System.out.print(marks[i]+ " ");
            }
               for(int i=0;i<marks.length;i++){
                // marks[i]=sc.nextInt();
                System.out.print(marks[i]+ " ");}
        }
    }
