package com.av.entry;

import com.av.myutil.VertexNotFound;
import com.av.myutil.VertexesExceeded;

public class App {

	public static void main(String[] args) {
		MyGraph g1 = new MyGraph(5, "directed");

		try {
			g1.addVertex("Asindu");
			g1.addVertex("Chamika");
			g1.addVertex("Nimila");
			g1.addVertex("Bhanuka");
			g1.addVertex("Manika");
		} catch (VertexesExceeded e) {
			e.printStackTrace();
		}

		try {
			g1.addEdge("Asindu", "Chamika");
			g1.addEdge("Nimila", "Bhanuka");
		} catch (VertexNotFound e) {
			e.printStackTrace();
		}

		g1.print();

	}

}
