package part2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node5{
	
	private int x,y;
	
	public Node5(int x, int y) {
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

public class ch5_4 {
	
	public static int[][] maze;
	public static int x,y;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		maze = new int[n][m];
		
		for(int i=0; i<n; i++) {	
			String str = sc.nextLine();
			for(int j=0; j<m; j++) {
				maze[i][j] = str.charAt(j) - '0';	
			}
		}
		int []dx = {1,-1,0,0};
		int []dy = {0,0,-1,1};
		x=0;
		y=0;
		
		Queue<Node5> q = new LinkedList<Node5>();
		q.offer(new Node5(0,0));
		while(!q.isEmpty()) {
			
			
			Node5 node = q.poll();
			x = node.getX();
			y = node.getY();
			
			
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx<0||nx>=n||ny<0||ny>=m) continue;
				if(maze[nx][ny]==0) continue;
				if(maze[nx][ny]==1) {
					maze[nx][ny]=maze[x][y]+1;
					q.offer(new Node5(nx,ny));
				}
				
			}
			
		}
		
		System.out.println(maze[n-1][m-1]);

	}

}
