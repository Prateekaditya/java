import java.util.ArrayList;

public class ContainerMostWater {

    public static int mostWater(ArrayList<Integer> height) {
        int maxWater = 0;
        // BruteForce
        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i + 1; j < height.size(); j++) {
        // int ht = Math.min(height.get(i), height.get(j));
        // int wd = j - i;
        // int currWater = ht * wd;
        // maxWater = Math.max(currWater, maxWater);
        // }
        // }
        // 2 Pointer Approach

        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int ht = Math.min(height.get(lp), height.get(rp));
            int wt = rp - lp;
            int currWater = ht * wt;
            maxWater = Math.max(currWater, maxWater);

            if (height.get(lp) <height.get(rp) ) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(9);
        int ans = mostWater(height);
        System.out.println("The container with most water area is: " + ans);
    }
}
