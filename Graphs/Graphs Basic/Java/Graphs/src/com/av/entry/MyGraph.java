package com.av.entry;

import com.av.myutil.VertexNotFound;
import com.av.myutil.VertexesExceeded;
import com.av.supply.Node;
import com.av.supply.Vertex;

public class MyGraph {

	int vertexCount;
	int numOfVertexes;
	boolean undirected = true;
	Vertex[] flow; // array of vertexes

	public MyGraph(int numOfVertexes, String dirOrUndir) {
		this.numOfVertexes = numOfVertexes;
		flow = new Vertex[numOfVertexes];
		vertexCount = 0;
		if (dirOrUndir.equals("directed")) {
			undirected = false;
		}
	}

	public void addVertex(String name) throws VertexesExceeded {
		if (vertexCount >= numOfVertexes) {
			throw new VertexesExceeded("Vertex " + name + " cannot be added");
		}
		flow[vertexCount] = new Vertex(name, null);
		vertexCount++;
	}

	public void addEdge(String srcVertex, String destVertex) throws VertexNotFound {
		int idSrcVertex = findVertex(srcVertex);
		int idDestVertex = findVertex(destVertex);

		if (idSrcVertex < 0) {
			throw new VertexNotFound(srcVertex + " not found ");
		}
		if (idDestVertex < 0) {
			throw new VertexNotFound(destVertex + " not found ");
		}

		flow[idSrcVertex].adjNode = new Node(idDestVertex, flow[idSrcVertex].adjNode);
		if (undirected) {
			flow[idDestVertex].adjNode = new Node(idSrcVertex, flow[idDestVertex].adjNode);
		}
	}

	public int findVertex(String vertexName) {
		int i = 0;
		while (i < flow.length) {
			if (flow[i].name.equals(vertexName)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public void print() {
		for (int i = 0; i < flow.length; i++) {

			Node temp = flow[i].adjNode;
			System.out.print(flow[i].name + " --> ");

			while (temp != null) {
				System.out.print(flow[temp.vertexId].name);
				temp = temp.next;
				if (temp == null)
					continue;
				System.out.println(" --> ");
			}
			System.out.println();
		}
	}
}
