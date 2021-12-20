package part3;

import java.util.Scanner;

public class ch13_16 {
	
	public static int map[][];
	public static int newmap[][];
	public static int n,m;
	public static int result=0;
	
	public static int dx[] = {1,-1,0,0};
	public static int dy[] = {0,0,1,-1};
	
	public static void virus(int x, int y) {
		
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=n||nx<0||ny>=m||ny<0) continue;
			
			if(newmap[nx][ny]==0) {
				newmap[nx][ny]=2;
				virus(nx, ny);
			}
			
		}
		
		
	}
	
	public static void getNewMap(int cnt) {
		
		if(cnt==3) {
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					newmap[i][j] = map[i][j];
				}
			}
			for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (newmap[i][j] == 2) {
                        virus(i, j);
                    }
                }
            }
			
			int now=0;
			for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (newmap[i][j] == 0) {
                        now++;
                    }
                }
            }
			
			result = Math.max(result, now);
			return;
		}
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j]==0) {
					map[i][j]=1;
					cnt++;
					getNewMap(cnt);
					cnt--;
					map[i][j]=0;
				} 
			}
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		map = new int[n][m];
		newmap = new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				
				map[i][j] = sc.nextInt();
			}
		}
		
		getNewMap(0);
		System.out.println(result);

	}

}
