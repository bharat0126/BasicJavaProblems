package com.datastructure.examples;

public class BinaryTree {
    
    public Node root ;
    
    
    /**
     * Method to add value in binary tree
     * Append.
     *
     * @param data the data
     */
    public void append(Integer data){
	//create node
	Node n=new Node(data);
	
	//no values in tree
	if(root ==null){
	    //add first element to the tree
	    root=n;
	    return;
	}else{
	   //add node in right place    
	    insertRec(root, n);
	}
	
    }


    private void insertRec(Node latest, Node newNode) {
	// node has to add on right side
	if (newNode.getData() > latest.getData()) {
	    if (latest.getRight() == null) {
		latest.setRight(newNode);
		return;
	    } else {
		insertRec(latest.getRight(), newNode);
	    }

	} else {
	    if (latest.getLeft() == null) {
		latest.setLeft(newNode);
		return;
	    } else {
		insertRec(latest.getLeft(), newNode);
	    }
	}
    }

    
    
}

class Node{
    private Node left;
    private Node right;
    private Integer data;
    Node(Integer data){
	this.data=data;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public Integer getData() {
        return data;
    }
    public void setData(Integer data) {
        this.data = data;
    }
}
