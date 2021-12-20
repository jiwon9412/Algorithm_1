package part2;

import java.util.Arrays;
import java.util.Scanner;

public class ch9_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int m= sc.nextInt();
		int [][]graph = new int[n+1][n+1];
		for(int i=1; i<=n; i++) {
			Arrays.fill(graph[i], (int)1e9);
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) graph[i][j]=0;
			}
		}
		
		for(int i=0; i<m; i++) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
			graph[b][a] = 1;
		}
		
		int x = sc.nextInt();
		int k = sc.nextInt();
		
		int minK = (int)1e9;
		for(int i=1; i<=n; i++) {
			int toK = Math.min(graph[1][k], graph[1][i]+graph[i][k]);
			if(minK>toK) minK = toK;
		}
		
		int minX = (int)1e9;
		for(int i=1; i<=n; i++) {
			int toX = Math.min(graph[k][x], graph[k][i]+graph[i][x]);
			if(minX>toX) minX = toX;
		}
		int result = minK+minX;
		if(minK==(int)1e9 || minX == (int)1e9) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
	}

}
