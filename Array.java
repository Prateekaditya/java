import java.util.*;
public class Array{
    public static int linearsearch(int marks[],int key){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                return i;
            }
        }
        return -1;
    }
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
                System.out.println(" ");
                System.out.println("Enter the key you want to search: ");
                int key=sc.nextInt();
                int ls =linearsearch(marks,key);
                if(ls==-1){
                    System.out.println("Key Not found.");
                }
                else{
                    System.out.println("Key found at index : " +ls);
                }
        }
    }
