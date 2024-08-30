public class BinarySearch {
    public static int functionBs(int number[], int key) {
        int start = 0;
        int end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;

            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 2, 4, 8, 10, 14, 18, 30 };
        int key = 20;
        int calue = functionBs(number, key);
        System.out.println("VALUes is a: " + calue);
    }
}