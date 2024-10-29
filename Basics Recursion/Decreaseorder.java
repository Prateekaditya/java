public class Decreaseorder {

    public static void decreaseOrder(int n) {
        if (n == 1) {
            System.out.println(n + "");
            return;
        }
        System.out.println(n + " ");
        decreaseOrder(n - 1);
    }

    public static void IncreaseOrder(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        IncreaseOrder(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        int n = 15;
        // decreaseOrder(n);
        IncreaseOrder(n);
    }
}
