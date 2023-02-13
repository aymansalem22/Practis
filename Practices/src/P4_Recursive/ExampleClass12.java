package P4_Recursive;

//Depth First Search in Graphs
import java.util.LinkedList;

public class ExampleClass12 {

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

		public void DFSRecursion(int startVertex) {
			boolean[] visitedArr = new boolean[numVertices];
			dfs(startVertex, visitedArr);
		}

	
		public void dfs(int start, boolean[] visitedArr) {
			visitedArr[start] = true;
			System.out.print(start + " ");
			for (int i = 0; i < tempList[start].size(); i++) {
				int toNode = tempList[start].get(i);
				if (!visitedArr[toNode])
					dfs(toNode, visitedArr);
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("Your DFS path is: ");
		int nVertices = 6;

		Graph g = new Graph(nVertices);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 5);

		
		g.DFSRecursion(0);

	}

}
