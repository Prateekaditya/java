import java.util.*;

public class SubArraySum{  
    public  static void maxSubSum(int num[]){ //bruteforce
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=num[k];
                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum="+maxSum);
    }

    public static void prefixsum(int num[]){
        int currSum=0,maxSum=Integer.MIN_VALUE;
        int prefix[]=new int[num.length];
        prefix[0]=num[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=1;j<num.length;j++){
                int end=j;
                currSum=start ==0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(maxSum<currSum){
                    maxSum=currSum;
                }          
            }
        }
          System.out.println("MAX SUM:"+maxSum);
    }
    public static void main(String[]args){
        int num[]={1, -2, 6, -1 ,3};
        prefixsum(num);
    }
}