package com.java.poc.dsa_templates;

import com.java.poc.dsa.tree.TreeNode;

public class Dfs {
    public static void main(String[] args) {

    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        // Check if it's a leaf node
        if (root.getLeft() == null && root.getRight() == null) {
            return sum == root.getVal();
        }

        // Recursively check both subtrees
        return hasPathSum(root.getLeft(), sum - root.getVal()) || hasPathSum(root.getRight(), sum - root.getVal());
    }

}
