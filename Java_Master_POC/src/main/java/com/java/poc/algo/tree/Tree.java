package com.java.poc.algo.tree;

public class Tree {
    private TreeNode root;

    public void insert(int val){
        if(root == null){
            root = new TreeNode(val);
        }else{
            root.insert(val);
        }
    }
}
