import java.util.LinkedList;

public class CLassroom {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        // add
        l1.addLast(1);
        l1.addLast(2);
        l1.addFirst(0);

        System.out.println(l1);

        l1.removeLast();
        l1.removeFirst();
        System.out.println(l1);

    }
}
