package part2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Road implements Comparable<Road>{
	
	private int homeA;
	private int homeB;
	private int cost;
	
	public Road(int homeA, int homeB, int cost) {
		
		this.homeA = homeA;
		this.homeB = homeB;
		this.cost = cost;
		
	}
	
	public int getHomeA() {
		return this.homeA;
	}
	
	public int getHomeB() {
		return this.homeB;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	@Override
	public int compareTo(Road o) {
		// TODO Auto-generated method stub
		return this.cost - o.cost;
	}
	
}

public class ch10_3 {
	
	public static int[] parent;
	public static List<Road> roads = new ArrayList<Road>();
	
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
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		parent = new int [n+1];
		
		for(int i=1;i<=n;i++) {
			parent[i] = i;
		}
		
		for(int i=0; i<m; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int cost = sc.nextInt();
			
			roads.add(new Road(a, b, cost));
		}
		
		Collections.sort(roads);
		int result = 0;
		int maxcost=0;
		for(int i=0; i<roads.size(); i++) {
			
			int a = roads.get(i).getHomeA();
			int b = roads.get(i).getHomeB();
			int cost = roads.get(i).getCost();
			
			if(findParent(a)!=findParent(b)) {
				result +=cost;
				unionParent(a, b);
				maxcost=cost;
			}
		}
		
		System.out.println(result-maxcost);
		

	}

}
