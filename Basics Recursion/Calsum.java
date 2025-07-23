
public class Calsum {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int value = n + sum(n - 1);
        return value;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
    }
}
