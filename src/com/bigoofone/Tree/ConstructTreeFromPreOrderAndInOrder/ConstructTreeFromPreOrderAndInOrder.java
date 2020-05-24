package com.bigoofone.Tree.ConstructTreeFromPreOrderAndInOrder;

public class ConstructTreeFromPreOrderAndInOrder {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] inOrder = {4, 2, 5, 1, 6, 3, 7};
        int[] preOrder = {1, 2, 4, 5, 3, 6, 7};

        Node root = tree.buildTree(preOrder, inOrder, 0, preOrder.length - 1);
        tree.printPostOrder(root);
    }
}

