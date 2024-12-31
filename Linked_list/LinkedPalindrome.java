import java.util.Scanner;

public class LinkedPalindrome {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");
        return;
    }

    // slow-fast concept
    public Node isMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step-1 Find the middle Node
        Node midNode = isMid(head);
        // step-2 reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next = curr.next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step-3 chEck left and right half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;

        }
        return true;
    }

    public static void main(String[] args) {
        LinkedPalindrome l1 = new LinkedPalindrome();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the LinkedList:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            l1.addFirst(sc.nextInt());
        }

        l1.printLL();
        System.out.println(l1.checkPalindrome());
        sc.close();
    }
}
