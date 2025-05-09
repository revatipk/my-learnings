package datastructures.binarytree;


import java.util.ArrayList;
import java.util.Queue;

public class BinaryTree {
    Node root;
    int length;

    public BinaryTree()
    {
        root = null;
        length = 0;
    }

    public void insert(int input)
    {
        Node node = new Node(input);
        if(this.root == null)
        {
            root = node;
        }
        else{
            Node currentNode = root;
            while(true)
            {
                if(node.value< currentNode.value){
                    if(currentNode.left==null)
                    {
                        currentNode.left=node;
                        return;
                    }
                        currentNode = currentNode.left;
                }
                else if(node.value>= currentNode.value){
                    if(currentNode.right==null){
                        currentNode.right=node;
                        return;
                    }
                        currentNode = currentNode.right;
                }
            }
        }
    }

    public boolean lookup(int input)
    {
        Node node = this.root;

        while (true) {
            if(node==null)
                return false;
            if (node.value == input)
                return true;
            else if (input > node.value)
                node = node.right;
            else
                node = node.left;
        }

    }
    public void remove(int input)
    {

    }
    public Node traverse(Node node)
    {
        Node currentNodeValue = node;
        System.out.println(currentNodeValue.value);
        if(node.left==null)
            return null;
        else
        traverse(node.left);
        if(node.right==null)
            return null;
        else
            traverse(node.right);
        return currentNodeValue;


    }

    public  ArrayList<Integer> breadthFirstSearchRecursive(
            java.util.ArrayList<Node> queue,
            ArrayList<java.lang.Integer> resultArray)
    {
        if(queue.size()==0)
        {
            return resultArray;
        }
        Node currentNode =queue.remove(0);
        resultArray.add(currentNode.value);
        if (currentNode.left!=null)
        {
            queue.add(currentNode.left);
        }
        if(currentNode.right!=null)
        {
            queue.add(currentNode.right);
        }
        return breadthFirstSearchRecursive(queue,resultArray);
    }
    public ArrayList<Integer> traverseInorder(Node node,ArrayList<Integer> array)
    {
        if(node.left!=null)
        {
            traverseInorder(node.left,array);
        }
        array.add(node.value);
        if(node.right!=null)
        {
            traverseInorder(node.right,array);
        }
        return array;
    }
    public ArrayList<Integer> traversePreorder(Node node,ArrayList<Integer> array)
    {
        array.add(node.value);
        if(node.left!=null)
        {
            traversePreorder(node.left,array);
        }
        if(node.right!=null)
        {
            traversePreorder(node.right,array);
        }
        return array;
    }
    public ArrayList<Integer> traversePostorder(Node node,ArrayList<Integer> array)
    {
         if(node.left!=null)
        {
            traversePostorder(node.left,array);
        }
        if(node.right!=null)
        {
            traversePostorder(node.right,array);
        }
        array.add(node.value);

        return array;
    }
    public static void main(String args[])
    {
        BinaryTree bst = new BinaryTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);
        bst.traverse(bst.root);
        System.out.println("Search 20 : "+bst.lookup(10));
        ArrayList<Node> queue = new ArrayList();
        queue.add(bst.root);
        System.out.println("bfs recursive: " + bst.breadthFirstSearchRecursive(queue, new ArrayList<Integer>()));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList = bst.traverseInorder(bst.root,arrayList);
        System.out.println("In-Order : "+arrayList);
        arrayList = bst.traversePostorder(bst.root,arrayList);
        System.out.println("Post-Order : "+arrayList);
        arrayList = bst.traversePreorder(bst.root,arrayList);
        System.out.println("Pre-Order : "+arrayList);
    }


}
