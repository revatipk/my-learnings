package datastructures.queues.queuesUsingLinkedList;

public class Queue {
    Node first=null;
    Node last = null;
    int length = 0;
    public void enqueue(String input) {
        Node node = new Node(input);
        if(length==0){
            first=last=node;
        }
        else {
            last.next = node;
            last = node;
        }
        length++;
    }
    public void dequeue() {
        if(length==0)
            System.out.println("No Elements");
        if (length==1) {
            System.out.println("Element = " + first.value);
            length = 0;
        }

        else {
            System.out.println("Element = "+first.value);
            first = first.next;
            length--;
        }

    }
    public String peek() {
        if(length>1)
            return last.value;
        if (length==1)
            return first.value;
        return null;
    }
    public boolean IsEmpty() {
        if(length==0)
            return true;
        return false;
    }
    public static  void main(String []args){
        Queue queue = new Queue();
//        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        queue.enqueue("Apple");
        queue.enqueue("Ball");
        queue.enqueue("Cat");
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
