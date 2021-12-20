package part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

class Node3 implements Comparable<Node3>{
	
	private int index;
	private int travel;
	
	public Node3(int index, int travel) {
		// TODO Auto-generated constructor stub
		this.index = index;
		this.travel = travel;
	}
	
	public int getIndex() {
		return this.index;
	}
	
	public int getTravel() {
		return this.travel;
	}
	 @Override
	public int compareTo(Node3 o) {
		// TODO Auto-generated method stub
		return this.travel - o.travel;
	}
}

public class ch9_3 {

	public static int n,m,c;
	public static ArrayList<ArrayList<Node3>> graph = new ArrayList<ArrayList<Node3>>();
	public static int[] d = new int[30001];
	
	
	public static void dijkstra(int start) {
		
		d[start]=0;
		PriorityQueue<Node3> q = new PriorityQueue<Node3>();
		q.offer(new Node3(start,0));
		
		while(!q.isEmpty()) {
			Node3 node = q.poll();
			int now = node.getIndex();
			int travel = node.getTravel();
			
			if(d[now] < travel) continue;
			for(int i=0; i<graph.get(now).size();i++) {
				
				int cost = graph.get(now).get(i).getTravel() + d[now];
				if(cost<d[graph.get(now).get(i).getIndex()]) {
					d[graph.get(now).get(i).getIndex()]=cost;
					q.offer(new Node3(graph.get(now).get(i).getIndex(),cost));
				}
					
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		n = sc.nextInt();
		m = sc.nextInt();
		c = sc.nextInt();
		
		
		
		Arrays.fill(d, (int)1e9);
		
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Node3>());
		}
		
		for(int i=0; i<m; i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			
			graph.get(x).add(new Node3(y,z));
		}
		
		dijkstra(c);
		int max=0;
		int cnt=0;
		
		for(int i=1; i<=n; i++) {
			if(!(d[i]==(int)1e9) && i!=0) {
				cnt++;
				max = Math.max(max, d[i]);
			}
		}
		
		
		System.out.println(cnt+" "+max);

	}

}
