package com.java.poc.dsa.tree;

public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getMinVal() {
        if (leftChild == null) {
            return data;
        } else {
            return leftChild.getMinVal();
        }
    }

    public int getMaxVal() {
        if (rightChild == null) {
            return data;
        } else {
            return rightChild.getMaxVal();
        }
    }

    public TreeNode getValue(int val) {
        if (val == data) {
            return this;
        }

        if (val < data) {
            if (leftChild != null) {
                return leftChild.getValue(val);
            }
        } else {
            if (rightChild != null) {
                return rightChild.getValue(val);
            }
        }

        return null;
    }

    public void insert(int val) {
        if (val == data) {
            return;
        }
        if (val < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(val);
            } else {
                leftChild.insert(val);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(val);
            } else {
                rightChild.insert(val);
            }
        }
    }

    public void traverseInOrder() {
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null) {
            rightChild.traverseInOrder();
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

    @Override
    public String toString() {
        return "data = " + data;
    }
}
