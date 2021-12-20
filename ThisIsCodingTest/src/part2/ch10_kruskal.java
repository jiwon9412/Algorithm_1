package part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	
	private int nodeA;
	private int nodeB;
	private int cost;
	
	public Edge(int nodeA, int nodeB, int cost) {
		
		this.nodeA = nodeA;
		this.nodeB = nodeB;
		this.cost = cost;
	}
	
	public int getNodeA() {
		return this.nodeA;
	}
	
	public int getNodeB() {
		return this.nodeB;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	@Override
	public int compareTo(Edge o) {
		// TODO Auto-generated method stub
		return this.cost-o.cost;
	}
}

public class ch10_kruskal {
	
	public static List<Edge> edges = new ArrayList<Edge>();
	public static int[] parent;
	
	public static int findParent(int x) {
		
		if(parent[x] == x) return x;
		else return findParent(parent[x]);
	}
	
	public static void unionParent(int a, int b) {
		
		a = findParent(a);
		b = findParent(b);
		if(a<b) parent[b] = a;
		else parent[a] = b;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int v = sc.nextInt();
		int e = sc.nextInt();
		
		parent = new int[v+1];
		
		for(int i=1; i<=v; i++) {
			parent[i] = i;
		}
		
		for(int i=0; i<e; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cost = sc.nextInt();
			
			edges.add(new Edge(a, b, cost));
		}
		
		Collections.sort(edges);
		
		int result = 0;
		for(int i=0; i<edges.size(); i++) {
			
			int a = edges.get(i).getNodeA();
			int b = edges.get(i).getNodeB();
			int cost = edges.get(i).getCost();
			
			if(findParent(a)!=findParent(b)) {
				
				unionParent(a, b);
				result+=cost;
			}
			
		}
		
		System.out.println(result);

	}

}
