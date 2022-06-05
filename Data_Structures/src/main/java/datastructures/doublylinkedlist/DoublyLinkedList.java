package datastructures.doublylinkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int lenght;

    public DoublyLinkedList(int value){
        head = new Node(value);
        tail = head;
        lenght =1;
    }
    public void append(int value){
        Node node = new Node(value);
        tail.next = node;
        node.previous = tail;
        tail = node;
        lenght ++;
    }
    public int getLenght(){
        return lenght;
    }
    public void print(){
        Node node = head;
        int i=0;
        while (i<lenght)
        {
            System.out.println(node.value);
            node = node.next;
            i++;
        }
    }
    public void insert(int value, int index)
    {
        if(index<0 || index>lenght){
            System.out.println("ARRAY OUT OF BOX");
        }
        if(index==0){
            prepend(value);
        }
        else if(index==lenght)
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
            lenght++;
        }
    }
    public void prepend(int value){
        Node node = new Node(value);
        node.next = head;
        head.previous = node;
        head = node;
        lenght++;
    }

    public void remove(int index)
    {
        if(index<0 || index>lenght){
            System.out.println("ARRAY OUT OF BOX");
        }
        else if(index ==0)
        {
            Node node = head;
            head = head.next;
            head.previous = null;
            lenght--;
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
            node.next.previous = node.previous;
            lenght--;
            if(i==lenght-1)
                tail = node;
        }
    }
    public void reversePrint()
    {
        int i=lenght-1;
        Node node = tail;
        while (i>=0)
        {
            System.out.println(node.value);
            node = node.previous;
            i--;
        }
    }
    public static void main(String []args)
    {
        DoublyLinkedList list = new DoublyLinkedList(10);
        list.append(12);
        list.append(14);
        list.append(16);
        list.print();
        list.insert(15,3);
        list.print();
        list.remove(2);
        list.print();
        list.reversePrint();
    }

}
