package com.java.poc.dsa.tree;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public int getMinVal() {
        if (left == null) {
            return val;
        } else {
            return left.getMinVal();
        }
    }

    public int getMaxVal() {
        if (right == null) {
            return val;
        } else {
            return right.getMaxVal();
        }
    }

    public TreeNode getValue(int val) {
        if (val == val) {
            return this;
        }

        if (val < val) {
            if (left != null) {
                return left.getValue(val);
            }
        } else {
            if (right != null) {
                return right.getValue(val);
            }
        }

        return null;
    }

    public void insert(int val) {
        if (val == val) {
            return;
        }
        if (val < val) {
            if (left == null) {
                left = new TreeNode(val);
            } else {
                left.insert(val);
            }
        } else {
            if (right == null) {
                right = new TreeNode(val);
            } else {
                right.insert(val);
            }
        }
    }

    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.print(val + ", ");
        if (right != null) {
            right.traverseInOrder();
        }
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "data = " + val;
    }
}
