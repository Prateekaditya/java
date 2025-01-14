public class MergeSort {
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

        // Step1 Create A newNode
        Node newnode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newnode;
            return;
        }
        // step-2 newnode next = head
        newnode.next = head; // link

        // step-3 head=newnode
        head = newnode;
    }

    public void printLL() {
        Node temp = head;
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // private Node getMid(Node head) {
    //     Node slow = head;
    //     Node fast = head;
    //     while (fast != null && fast.next != null) {
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }
    //     return slow;
    // }
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next; // Start `fast` one step ahead
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // Slow now points to the midpoint of the list
    }
    

    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;

        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergeSort l1 = new MergeSort();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.printLL();
        l1.head = l1.mergeSort(l1.head);
        l1.printLL();
    }
}
