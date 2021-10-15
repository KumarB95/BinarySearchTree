package com.bridgelabz;

public class BinaryNode<K extends Comparable<K>> {
    K key;
    BinaryNode<K> left;
    BinaryNode<K> right;

    public BinaryNode(K key)
    {
        super();
        this.key = key;
        this.left = null;
        this.right = null;
    }
    @Override
    public String toString() {
        return "BinaryNode{" + "key=" + key + ", left=" + left + ", right=" + right + '}';
    }
}
