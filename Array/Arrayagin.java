import java.util.*;

public class Arrayagin{
    public static void rev(int nums[]){
        int first=0;
        int last=nums.length-1;
        while(first<last){
            int temp=nums[last];
            nums[last]=nums[first];
            nums[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Size of the array you want to enter:");
        int n = sc.nextInt();
        int nums[]=new int [n];
        for(int i=0;i<nums.length;i++){
            nums[i]=sc.nextInt();
            System.out.println("Element at array index " +i+ "is " +nums[i]);
        }
        rev(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println("Element at array index " +i+ "is " +nums[i]);
        }
    }
}