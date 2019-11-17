package com.av.supply;

public class Node {
	public int vertexId;
	public Node next;

	public Node(int destNode, Node nextNode) {
		this.vertexId = destNode;
		next = nextNode;
	}
}
