package com.java.poc.dsa.tree;

public class MyTreeImpl {
    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insert(25);
        myTree.insert(20);
        myTree.insert(15);
        myTree.insert(27);
        myTree.insert(30);
        myTree.insert(29);
        myTree.insert(22);
        myTree.insert(32);

        myTree.traverseInOrder();

        System.out.println(" ");

        System.out.println(myTree.get(30));
        System.out.println(myTree.get(25));
        System.out.println(myTree.get(76));

        System.out.println(" ");
        System.out.println("Max val is : "+myTree.getMaxVal());
        System.out.println("Min val is : "+myTree.getMinVal());
    }
}
