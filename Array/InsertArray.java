import java.util.*;
public class InsertArray{
    
    public static int searchInsert(int[] nums, int target) {
      for(int i=0;i<nums.length;i++){
        if(target<=nums[i]){
            return i;
        }
      }
      return nums.length;
    }

public static void main(String[]args){
    int nums[] = {5,7,10,12,13};
    int target=10;
    searchInsert(nums,target);
}
}