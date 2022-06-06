package datastructures.stack.stackUsingArray;

import java.util.ArrayList;

public class Stack {
    ArrayList<String> stack;
    public Stack()
    {
        stack = new ArrayList();
    }
    public String peep(){
        if(!isEmpty())
            return stack.get(0);
        return null;
    }
    public void pop(){
        stack.remove(0);
    }
    public void push(String input)
    {
        stack.add(0,input);
    }
    public boolean isEmpty()
    {
        if(stack.size()==0)
            return true;
        return false;
    }
    public static void main(String []args)
    {
        Stack stack = new Stack();
        stack.push("Hi");
        stack.push("Hello");
        stack.push("World");
        System.out.println(stack.peep());
        stack.pop();
        System.out.println(stack.peep());
    }
}
