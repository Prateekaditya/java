import java.util.*;


public class StaircaseSort{
    public static boolean Staircase(int mat[][],int key){
        int row=mat.length-1;int col=0;
        
        while(row>=0 && col<mat.length){
            if(mat[row][col]==key){
                System.out.println("Key Found at ("+row+","+col+")");
                return true;
            }
            else if(key<mat[row][col]){
                row--;
            }
            else{
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){
        int mat[][]={{10,20,30,40},
                     {15,30,45,60},
                     {17,34,51,68},
                     {22,44,66,88}};
        int key=11;
        Staircase(mat,key);
    }
}