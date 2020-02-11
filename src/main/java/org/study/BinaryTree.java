package org.study;

class Node {
    int value;
    Node leftNode;
    Node rightNode;

    Node(int value) {
        this.value = value;
        leftNode = null;
        rightNode = null;
    }
}

public class BinaryTree {
    Node root;

    private Node addRecursive(int value, Node current) {
        if (current == null)
            return new Node(value);
        else if (value < current.value)
            current.leftNode = addRecursive(value, current.leftNode);
        else if (value > current.value)
            current.rightNode = addRecursive(value, current.rightNode);
        else
            return current;
        return current;
    }

    public void addNode(int value) {
        root = addRecursive(value, root);
    }

    public void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.leftNode);
            System.out.println(root.value);
            traverseInOrder(root.rightNode);
        }
    }
    public void traversePreOrder(Node root) {
        if (root != null) {
            System.out.println(root.value);
            traverseInOrder(root.leftNode);
            traverseInOrder(root.rightNode);
        }
    }
    public void traversePostOrder(Node root) {
        if (root != null) {

            traverseInOrder(root.leftNode);
            traverseInOrder(root.rightNode);
            System.out.println(root.value);
        }
    }

    public static void main(String[] args) {
        /* // */
        BinaryTree tree=new BinaryTree();
        tree.addNode(3);
        tree.addNode(5);
        tree.addNode(2);
        tree.addNode(6);
        tree.addNode(1);

        tree.traverseInOrder(tree.root);
        tree.traversePreOrder(tree.root);
        tree.traversePostOrder(tree.root);
    }


}
interface BaseI { void method(); }

class BaseC
{
    public void method()
    {
        System.out.println("Inside BaseC::method");
    }
}

class ImplC extends BaseC implements BaseI
{
    public static void main(String []s)
    {
        (new ImplC()).method();
    }
}