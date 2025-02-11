import java.util.*;
public class ReverseStack {
    public static void pushAtB(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushAtB(s, data);
        s.push(top);
    }
    public static void revStack(Stack<Integer> s){
        if(s.isEmpty()){
            return  ;
        }
        int top=s.pop();
        revStack(s);
        pushAtB(s,top);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);
        // printStack(s);
        revStack(s);
        // System.out.println("new stack");
        // printStack(s);
        printStack(s);
        // System.out.println("new stack");

    }
}
