import java.util.*;

public class Swap {
    public static void swap(ArrayList<Integer> arr, int indx1, int indx2) {
        int temp = arr.get(indx1);
        arr.set(indx1, arr.get(indx2));
        arr.set(indx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(11);
        arr.add(25);
        arr.add(9);
        arr.add(6);
        int indx1 = 0;
        int indx2 = 4;
        System.out.println(arr);
        swap(arr, indx1, indx2);
        System.out.println(arr);
    }
}
