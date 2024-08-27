import java.util.*;

public class Max {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(121);
        arr.add(25);
        arr.add(9);
        arr.add(6);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            max = Math.max(max, arr.get(i));
        }
        System.out.println(max);
    }

}
