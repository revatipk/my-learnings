package datastructures.stack.stackUsingLinkedlist;

public class Stack {
    Node top;
    Node bottom;
    int lenght;

    public Stack()
    {
        top=null;
        bottom=null;
        lenght = 0;
    }

    public void push(String input) {
        Node node = new Node(input);
        if (lenght == 0) {
            top = bottom = node;
        } else {
            node.next = top;
            top = node;
            lenght++;
        }
    }
        public void pop () {
            System.out.println(top.value);
            top = top.next;
            lenght--;
        }
        public String peek ()
        {
            if (top != null) {
                return top.value;
            }
            return null;
        }
        public boolean isEmpty ()
        {
            if (lenght > 0)
                return false;
            return true;
        }
    public static void main(String []args)
    {
        datastructures.stack.stackUsingArray.Stack stack = new datastructures.stack.stackUsingArray.Stack();
        stack.push("Hi");
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.peep());
        stack.pop();
        System.out.println(stack.peep());
    }
}
