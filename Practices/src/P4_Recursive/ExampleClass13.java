package P4_Recursive;

import java.util.LinkedList;
import java.util.Stack;

//Topological Sort in Graphs 
public class ExampleClass13 {
	static class Graph {
		int numVertices;
		LinkedList<Integer>[] tempList;

		Graph(int numVertices) {
			this.numVertices = numVertices;
			tempList = new LinkedList[numVertices];
			for (int i = 0; i < numVertices; i++) {
				tempList[i] = new LinkedList<>();
			}
		}

		
		public void addEdge(int fromNode, int toNode) {
			tempList[fromNode].addFirst(toNode);
		}

		public void topologicalSorting() {
			boolean[] visited = new boolean[numVertices];
			Stack<Integer> ts = new Stack<>();

			
			for (int i = 0; i < numVertices; i++) {
				if (!visited[i]) {
					topologicalSortRecursive(i, visited, ts);
				}
			}
			System.out.println("Topological Sort: ");
			int size = ts.size();
			for (int i = 0; i < size; i++) {
				System.out.print(ts.pop() + " ");
			}
		}

		public void topologicalSortRecursive(int start, boolean[] visited, Stack<Integer> ts) {
			visited[start] = true;
			for (int i = 0; i < tempList[start].size(); i++) {
				int vertex = tempList[start].get(i);
				if (!visited[vertex])
					topologicalSortRecursive(vertex, visited, ts);
			}
			ts.push(start);
		}
	}

	public static void main(String[] args) {
		System.out.println("Path after Topological Sorting: ");
		int nVertices = 5;
		Graph g = new Graph(nVertices);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(2, 4);

	
		g.topologicalSorting();

	}
}
