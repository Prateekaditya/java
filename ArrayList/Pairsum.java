import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Pairsum {
    // Pair sum 1 in this array is sorted
    public static void pairSum(ArrayList<Integer> numbers, int target) {

        // //Brute force
        // for (int i = 0; i < numbers.size(); i++) {
        // for (int j = i + 1; j < numbers.size(); j++) {
        // if (numbers.get(i) + numbers.get(j) == target) {
        // System.out.println("i:" + i + " j:" + j);
        // break;
        // }
        // }
        // }

        // two Pointer approach

        int lp = 0;
        int rp = numbers.size() - 1;
        while (lp != rp) {
            if (numbers.get(lp) + numbers.get(rp) == target) {
                System.out.println("index1:" + lp + " index2:" + rp);
            }
            if (numbers.get(lp) + numbers.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter the number You want to enter");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println(numbers);
        Collections.sort(numbers);
        int target = 10;
        pairSum(numbers, target);
    }
}
