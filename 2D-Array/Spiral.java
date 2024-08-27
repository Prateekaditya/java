import java.util.*;


 public class Spiral{
        public static void printSpiral(int arr[][]){
        int startrow=0;
        int startcol=0;
        int endrow=arr.length-1;
        int endcol=arr[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                System.out.print(arr[startrow][j]+ " ");
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(arr[i][endcol]+ " ");
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(arr[endrow][j]+ " ");
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(arr[i][startcol]+ " ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }
    public static void main(String args[]){
        int arr[][]={   {1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                    };
                
        printSpiral(arr);

    
    }
 }