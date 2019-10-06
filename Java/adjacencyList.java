import java.io.*;
import java.util.*;

public class adjacencyList {
	static class graph{
		int V;
		public List<LinkedList<Integer>> adjacencyList;
		public graph(int v) {
			V=v;
			adjacencyList = new ArrayList<LinkedList<Integer>>();
			for (int j=0; j<v; j++) {
				adjacencyList.add(new LinkedList<Integer>());
			}
		}
		
		void AddEdge(int u,int v) {
			adjacencyList.get(u).add(v);
			adjacencyList.get(v).add(u);
		}
		
		void printAdjList() {

			for(int i=0;i<V;i++) {
				
				System.out.print(i+" -> ");
				for(int node:adjacencyList.get(i)) {
					System.out.print(node + ",");
				}
				System.out.println();
			}
			
			
			
		}
		
		void bfs(Integer src, Integer dest) {
			Queue<Integer>q=  new LinkedList<>();
			boolean [] visited = new boolean[V+1];
			int[] distance = new int[V+1];
			Arrays.fill(distance, 0);
			int[] parent = new int[V+1];
			Arrays.fill(parent, -1);
			Arrays.fill(visited, false);
			q.add(src);
			visited[src]=true;
			while(!q.isEmpty()) {
				int node = q.poll();
				System.out.println(node);
				for(int neighbor:adjacencyList.get(node)) {
					if(!visited[neighbor]) {
						q.add(neighbor);
						visited[neighbor]=true;
						distance[neighbor]=distance[node]+1;
						parent[neighbor]=node;
					}
				}
				
			}
			
			for(int i=0;i<V;i++) {
				System.out.println(i + " node distance is: "+distance[i]);
			}
			
			
			
			Integer temp = dest;
			while(temp!=-1) {
				System.out.print(temp+" <-- ");
				temp=parent[temp];
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		graph g= new graph(6);
		g.AddEdge(0,1);
		g.AddEdge(1,2);
		g.AddEdge(2,3);
		g.AddEdge(5,3);
		g.AddEdge(0,4);
		g.AddEdge(4,3);
//		g.printAdjList();
		g.bfs(0,5);
		
	}

}
