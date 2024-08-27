import java.util.*;

public class Listarray {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        list.add(132);
        list.add(2);
        list.add(8);
        list.add(10);
        list.add(2, 12);
        // System.out.println(list.size());
        // System.out.println(list);
        list2.add("hello");
        list2.add("Prateek");
        // for (int i = 0; i < list2.size(); i++) {
        // System.out.print(list2.get(i) + " ");
        // }
        // System.out.println();
        list3.add(true);
        list3.add(false);
        // System.out.print(list3);
        // for (int i = list2.size() - 1; i >= 0; i--) {
        // System.out.print(list2.get(i) + " ");
        // }
        System.out.println(list.remove(2));
        System.out.println(list);

    }
}