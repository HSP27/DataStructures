package com.bigoofone.Tree.ConstructTreeFromPreOrderAndInOrder;

class Node {

    int key;
    Node leftNode, rightNode = null;

    Node(int item){
        this.key = item;
        leftNode = rightNode =null;
    }

}
