package part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
class Node implements Comparable<Node>{
	
	private int index;
	private int distance;
	
	public Node(int index, int distance) {
		
		this.index = index;
		this.distance = distance;
	}

	public int getIndex() {
		return this.index;
	}
	
	public int getDistance() {
		return this.distance;
	}
	
	@Override
	public int compareTo(Node o) {
		
		return this.distance - o.distance;
	}
	
}

public class ch9_dijkstra {
	
	public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
	public static int[] d = new int [10001];
	public static int n;
	public static int m;
	public static int start;
	
	public static void dijkstra(int start) {
		
		d[start] = 0;
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.offer(new Node(start,0));
		
		while(!pq.isEmpty()) {
			
			Node node = pq.poll();
			int dist = node.getDistance();
			int now = node.getIndex();
			
			if(d[now]<dist) continue;  //이미 처리한경우 넘어가기
			for(int i=0; i<graph.get(now).size(); i++) {
				int cost = graph.get(now).get(i).getDistance() + d[now];
				
				if(cost<d[graph.get(now).get(i).getIndex()]) {
					d[graph.get(now).get(i).getIndex()] = cost;
					pq.offer(new Node(graph.get(now).get(i).getIndex(),cost));
				}
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		start = sc.nextInt();
		
		
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Node>());
		}
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			graph.get(a).add(new Node(b,c));
		}
		
		Arrays.fill(d, (int)1e9);
		dijkstra(start);
		
		for(int i=1; i<=n; i++) {
			if(d[i]==(int)1e9) {
				System.out.println("도달할수없습니다.");
			}else {
				System.out.println(d[i]);
			}
		}

	}

}
