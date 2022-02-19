package com.java.poc.dsa.tree;

public class Tree {
    private TreeNode root;

    public void insert(int val) {
        if (root == null) {
            root = new TreeNode(val);
        } else {
            root.insert(val);
        }
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public TreeNode get(int val) {
        if (root != null) {
            return root.getValue(val);
        }
        return null;
    }

    public int getMinVal() {
        if (root == null) {
            return Integer.MIN_VALUE;
        } else {
            return root.getMinVal();
        }
    }

    public int getMaxVal() {
        if (root == null) {
            return Integer.MAX_VALUE;
        } else {
            return root.getMaxVal();
        }
    }

    public void delete(int val){
        root = delete(root,val);
    }

    private TreeNode delete(TreeNode subtreeRoot, int val){
        if(subtreeRoot == null){
            return subtreeRoot;
        }if(val < subtreeRoot.getData()){
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(),val));
        } else if(val > subtreeRoot.getData()){
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(),val));
        }else{
            //cases 0 & 1 : node to delete if 0 or 1 child
            if(subtreeRoot.getLeftChild() == null){
                return subtreeRoot.getRightChild();
            }else if(subtreeRoot.getRightChild() == null){
                return subtreeRoot.getLeftChild();
            }
        }

        return subtreeRoot;
    }
}
