import java.util.*;
public class Creation{
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Key found at ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no.of rows:");
        int n=sc.nextInt();
        System.out.print("Enter the no.of columns:");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.print("Enter the Number you want to search:");
        int key=sc.nextInt();
        search(matrix,key);
    }
}