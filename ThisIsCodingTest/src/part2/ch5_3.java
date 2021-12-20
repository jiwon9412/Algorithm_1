package part2;

import java.util.Scanner;


public class ch5_3 {
	
	public static int [][]graph;
	public static int n,m;
	
	public static boolean findIce(int x, int y) {
		
		if(x<0||x>=n||y<0||y>=m)
			return false;
		
		if(graph[x][y]==0) {
			
			graph[x][y]=1;
			
			findIce(x+1,y);
			findIce(x-1,y);
			findIce(x,y+1);
			findIce(x,y-1);
			
			return true;
			
		}
		
		return false;
		
	}
 
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();
        
        graph = new int[n][m];
        
        for(int i=0; i<n; i++) {
        	
        	String str = sc.nextLine();
        	for(int j=0; j<m; j++) {
        		
        		graph[i][j] = str.charAt(j) - '0';
        	}
        }
        
        
        
        int cnt=0;
        for(int i=0; i<n; i++) {
        	
        	for(int j=0; j<m; j++) {
        		if(findIce(i, j))
        			cnt++;
        	}
        }
        
        System.out.println(cnt);
       
    }
}
