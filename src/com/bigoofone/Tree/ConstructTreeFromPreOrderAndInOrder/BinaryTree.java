package com.bigoofone.Tree.ConstructTreeFromPreOrderAndInOrder;

class BinaryTree {
    Node root;
    private int preIndex = 0;

    BinaryTree() {
        root = null;
    }


    Node buildTree(int[] preOrder, int[] inOrder, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            throw new IllegalArgumentException("startIndex can't be greater than endIndex");
        }
        Node tNode = new Node(preOrder[preIndex++]);

        int inIndex = search(inOrder, startIndex, endIndex, tNode.key);

        if (inIndex == -1) {
            throw new IllegalArgumentException("invalid Pre Order and InOrder. Tree can't be constructed");
        }

        if (startIndex == endIndex) {
            return tNode;
        }

        tNode.leftNode = buildTree(preOrder, inOrder, startIndex, inIndex - 1);
        tNode.rightNode = buildTree(preOrder, inOrder, inIndex + 1, endIndex);
        return tNode;
    }

    private int search(int[] inOrder, int startIndex, int endIndex, int item) {
        for (int i = startIndex; i <= endIndex; i++) {
            if (inOrder[i] == item) {
                return i;
            }
        }
        return -1;
    }

    void printPostOrder(Node root) {
        if (root == null) {
            return;
        }
        printPostOrder(root.leftNode);
        printPostOrder(root.rightNode);
        System.out.print(root.key);

    }
}

