package part3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Country{
	
	private int x,y;
	
	public Country(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	
	
}

public class ch13_21 {
	
	public static int n,l,r;
	public static int map[][];
	public static int[] dx = {1,-1,0,0};
	public static int[] dy = {0,0,1,-1};
	public static int[][] union;
	
	public static void move(int x, int y, int index) {
		
		Queue<Country> q = new LinkedList<Country>();
		ArrayList<Country> list = new ArrayList<Country>();
		
		q.offer(new Country(x, y));
		list.add(new Country(x, y));
		union[x][y]=index;
		while(!q.isEmpty()) {
			
			Country ct = q.poll();
			int a = ct.getX();
			int b = ct.getY();
			
			
			for(int i=0; i<4; i++) {
				
				int nx = a+dx[i];
				int ny = b+dy[i];
				
				if(nx<0||nx>=n||ny<0||ny>=n) continue;
				if(union[nx][ny]!=-1) continue;
				
				if(Math.abs(map[a][b]-map[nx][ny])>=l && Math.abs(map[a][b]-map[nx][ny])<=r) {
					
					q.offer(new Country(nx, ny));
					list.add(new Country(nx, ny));
					union[nx][ny] = index;
				}
			}
			
			
			
		}
		if(list.size()>1) {
			int sum=0;
			for(int i=0; i<list.size(); i++) {
				
				sum+=map[list.get(i).getX()][list.get(i).getY()];
			}
			int result = sum/list.size();
			for(int i=0; i<list.size(); i++) {
				
				map[list.get(i).getX()][list.get(i).getY()]=result;
			}
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		l = sc.nextInt();
		r = sc.nextInt();
		
		map = new int[n][n];
		union = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				
				map[i][j]=sc.nextInt();
				
			}
		}
		int cnt=0;
		
		while(true) {
			int index=0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					
					union[i][j] = -1;
				}
			}
			
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(union[i][j]==-1) {
						move(i,j,index);
						index++;
					}
					
				}
			}
			if(index==n*n) break;
			cnt++;
			
		}
		
		System.out.println(cnt);
	}

}
