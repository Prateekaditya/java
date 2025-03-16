import java.util.*;

public class Twoqueue {
    static class Stack {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return an invalid value
            }

            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    if (q1.isEmpty()) break;
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    if (q2.isEmpty()) break;
                    q1.add(top);
                }
            }
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return an invalid value
            }

            int top = -1;
            if (!q1.isEmpty()) {
                while (!q1.isEmpty()) {
                    top = q1.remove();
                    q2.add(top);
                }
            } else {
                while (!q2.isEmpty()) {
                    top = q2.remove();
                    q1.add(top);
                }
            }
            return top;
        }
    }

    public static void main(String[] args) {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        while (!s1.isEmpty()) {
            System.out.println(s1.peek());
            s1.pop();
        }
    }
}
