package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Virus implements Comparable<Virus>{
	
	private int index;
	private int second;
	private int nodeX;
	private int nodeY;
	
	public Virus(int index,int second,int nodeX,int nodeY) {
		
		this.index = index;
		this.second = second;
		this.nodeX = nodeX;
		this.nodeY = nodeY;
	}
	
	public int getIndex() {
		return this.index;
	}
	public int getSecond() {
		return this.second;
	}
	public int getNodeX() {
		return this.nodeX;
	}
	public int getNodeY() {
		return this.nodeY;
	}
	
	@Override
	public int compareTo(Virus o) {
		// TODO Auto-generated method stub
		return this.index-o.index;
	}
	
	
	
}

public class ch13_17 {
	
	public static int n,k;
	public static int graph[][];
	public static int []dx = {1,-1,0,0};
	public static int []dy = {0,0,1,-1};
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		k = sc.nextInt();
		graph = new int [n+1][n+1];
		ArrayList<Virus> list = new ArrayList<Virus>();
		Queue<Virus> q = new LinkedList<Virus>();
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				graph[i][j] = sc.nextInt();
				if(graph[i][j]!=0) {
					list.add(new Virus(graph[i][j], 0, i, j));
				}
			}
		}
		
		int s = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		Collections.sort(list);
		
		for(int i=0; i<list.size(); i++) {
			q.offer(list.get(i));
		}
		
		while(!q.isEmpty()) {
			
			Virus virus = q.poll();
			if(virus.getSecond()>=s) break;
			
			for(int i=0; i<4; i++) {
				int nx = virus.getNodeX()+dx[i];
				int ny = virus.getNodeY()+dy[i];
				
				if(nx>n||nx<=0||ny>n||ny<=0) continue;
				if(graph[nx][ny]==0) {
					graph[nx][ny] = virus.getIndex();
					q.offer(new Virus(virus.getIndex(), virus.getSecond()+1, nx, ny));
				}
					
				
			}
			
		}
		
		
		System.out.println(graph[x][y]);

	}

}
