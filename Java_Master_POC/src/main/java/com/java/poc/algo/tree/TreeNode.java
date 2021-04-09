package com.java.poc.algo.tree;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int val){
        if(val == data){
            return;
        }
        if(val < data){
            if(leftChild == null){
                leftChild = new TreeNode(val);
            }else{
                leftChild.insert(val);
            }
        }else {
            if(rightChild == null){
                rightChild = new TreeNode(val);
            }else{
                rightChild.insert(val);
            }
        }
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
