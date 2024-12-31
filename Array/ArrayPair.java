import java.util.*;

// by this we are printing all the pairs 
public class ArrayPair {
    public static void printpair(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = 0; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ")");
            }
            System.out.println();
        }
    }

    // to print sub array
    public static void subArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = 0; j < num.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array:");
        int n = sc.nextInt();
        int num[] = new int[n];
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        System.out.print("(");
        for (int i = 0; i < num.length; i++) {
            System.out.print(" " + num[i] + " ");
        }
        System.out.println(")");
        printpair(num);
        // subArray(num);
    }
}