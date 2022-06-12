package datastructures.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public LinkedList(int value){
        head = new Node(value);
        tail = head;
        length =1;
    }
    public void append(int value){
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        length++;
    }
    public int getLength(){
        return length;
    }
    public void print(){
        Node node = head;
        int i=0;
        while (i< length)
        {
            System.out.println(node.value);
            node = node.next;
            i++;
        }
    }
    public void insert(int value, int index)
    {
        if(index<0 || index> length){
            System.out.println("ARRAY OUT OF BOX");
        }
        if(index==0){
            prepend(value);
        }
        else if(index== length)
        {
            append(value);
        }
        else
        {
            Node node = head;
            for(int i=0;i<index-1;i++)
                node = node.next;
            Node insert = new Node(value);
            insert.next = node.next;
            node.next = insert;
            length++;
        }
    }
    public void prepend(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        length++;
    }

    public void remove(int index)
    {
        if(index<0 || index> length){
            System.out.println("ARRAY OUT OF BOX");
        }
        else if(index ==0)
        {
            Node node = head;
            head = head.next;
            node = null;
            length--;
        }
        else
        {
            Node node = head;
            int i =0;
            while (i<index -1)
            {
                node = node.next;
                i++;
            }
            node.next = node.next.next;
            length--;
            if(i== length -1)
                tail = node;
        }
    }

    public LinkedList reverse(LinkedList list)
    {
        LinkedList newlist = new LinkedList(list.head.value);
        Node current = list.head;
        while(current.next!=null)
        {
            current=current.next;
            Node newNode = new Node(current.value);
            newNode.next = newlist.head;
            newlist.head = newNode;
            newlist.length++;
        }
        return newlist;
    }
    public static void main(String []args)
    {
        LinkedList list = new LinkedList(10);
        list.append(12);
        list.append(14);
        list.append(16);
        list.print();
        System.out.println("\n");
        list.insert(15,3);
        list.print();
        System.out.println("\n");
        list.remove(2);
        list.print();
        System.out.println("\n");
        LinkedList reverse = list.reverse(list);
        reverse.print();
    }

}
