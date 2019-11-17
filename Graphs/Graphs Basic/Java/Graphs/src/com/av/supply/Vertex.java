package com.av.supply;

public class Vertex {

	public String name;
	public Node adjNode = null;

	public Vertex(String name, Node aNode) {
		this.name = name;
		this.adjNode = aNode;
	}
}
