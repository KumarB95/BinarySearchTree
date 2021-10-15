package com.bridgelabz;

public class BinarySearchTree <K extends Comparable<K>>{
    public static void main(String[] args) {
        System.out.println("Welcome to BinarySearchTree program");
        BinarySearchTree<Integer> binaryTree = new BinarySearchTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        System.out.println(binaryTree);
    }
    private BinaryNode<K> root;

    public void add(K key)
    {
        this.root = this.insertData(root,key);
    }

    public BinaryNode<K> insertData(BinaryNode<K> current, K key)
    {
        if(current ==  null)
            return new BinaryNode<>(key);
        int compareResult = key.compareTo(current.key);

        if(compareResult==0)
            return current;

        if(compareResult<0)
        {
            current.left = insertData(current.left, key);
        }
        else
        {
            current.right = insertData(current.right, key);
        }
        return current;
    }
    @Override
    public String toString()
    {
        return "MyBinary [root=" + root + "]";
    }
}
