package com.java.poc.dsa.tree;

public class SearchInBST {

    public static void main(String[] args) {
        TreeNode1 myTree = new TreeNode1();

    }

    public TreeNode1 searchBST(TreeNode1 root, int val) {
        TreeNode1 ans;
        if(root==null||root.val==val){
            return root;
        }
        if(root.val>val){
            ans = searchBST(root.left,val);
        }else{
            ans = searchBST(root.right,val);
        }

        return ans;
    }
}

