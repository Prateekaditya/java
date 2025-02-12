public class CirculaeQueue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n) {
            arr= new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return  rear==-1 && front==-1;
        }
        public static boolean isfull(){
            return  (rear+1)%size==front;
        }
        public static void add(int data){
            if(isfull()){
                System.out.println("Queue is full");
                return;
            }
            if (front==-1) {
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            int res=arr[front];
                // last element
                if(rear==front){
                    rear=front=-1;
                }
                else{
                front=(front+1)%size;
                }
                return res;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
