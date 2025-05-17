import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        //Given an integer array of size n find all elements that aappers more than [n/3] times
        int arr[]={1,2};
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<arr.length;i++){
          map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(Integer k:map.keySet()){
            if(map.get(k) >arr.length/3){
                System.out.println("Elements Are= "+k);
            }
        }
}
}
