package com.java.poc.dsa_templates;

import com.java.poc.dsa.tree.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {

    public static void main(String[] args) {

        TreeNode myTree = new TreeNode(1);
        myTree.insert(25);
        myTree.insert(20);
        myTree.insert(15);
        myTree.insert(27);
        myTree.insert(30);
        myTree.insert(29);
        myTree.insert(22);
        myTree.insert(32);
        System.out.println("My Tree : "+bfsTraversal(myTree));
    }

    public static List<List<Integer>> bfsTraversal(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.getVal());

                // Add left and right children to the queue
                if (currentNode.getLeft() != null) queue.offer(currentNode.getLeft());
                if (currentNode.getRight() != null) queue.offer(currentNode.getRight());
            }

            result.add(currentLevel); // Add the current level to the result
        }

        return result;
    }

}
