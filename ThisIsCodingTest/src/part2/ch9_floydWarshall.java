package part2;

import java.util.Arrays;
import java.util.Scanner;

public class ch9_floydWarshall {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int [][]graph = new int [n+1][n+1];
		for(int i=0; i<=n; i++) {
			Arrays.fill(graph[i], (int)1e9);
		}
		
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			graph[a][b] = c;
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i==j) graph[i][j] = 0;
			}
		}
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=n; k++) {
					graph[j][k] = Math.min(graph[j][k],graph[j][i]+graph[i][k]);
				}
				
				
			}
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println();
			for(int j=1; j<=n; j++) {
				System.out.print(graph[i][j]+" ");
			}
		}

	}

}
