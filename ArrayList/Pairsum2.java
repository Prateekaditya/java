import java.util.ArrayList;
import java.util.Collections;

public class Pairsum2 {

    public static void pairSumtech2(ArrayList<Integer> numbers, int target) {
        // Brute force approach will be the safe for this also
        // 2pointer approach
        int bp = -1;
        int n = numbers.size();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > numbers.get(i + 1)) {
                bp = i;
                break;
            }
        }
        int lp = bp + 1; // smallesr
        int rp = bp; // largest
        while (lp != rp) {
            if (numbers.get(lp) + numbers.get(rp) == target) {
                System.out.println(lp + "," + rp);
            }
            if (numbers.get(lp) + numbers.get(rp) < target) {
                lp = ((lp + 1) % n);
            } else {
                rp = ((n + rp - 1) % n);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(14);
        numbers.add(15);
        numbers.add(16);
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        int target = 12;
        pairSumtech2(numbers, target);
    }
}
