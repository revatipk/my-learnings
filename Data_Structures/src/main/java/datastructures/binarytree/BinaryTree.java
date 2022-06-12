package datastructures.binarytree;

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
    }


}
