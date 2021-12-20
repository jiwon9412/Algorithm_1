package part3;

import java.util.Scanner;
//실패
public class ch13_20 {
	
	public static int n;
	
	public static String[][] way;
	public static String[][] newway;
	public static int[][]dx = {{1,2,3,4},{-1,-2,-3,-4},{0,0,0,0},{0,0,0,0}};
	public static int[][]dy = {{0,0,0,0},{0,0,0,0},{1,2,3,4},{-1,-2,-3,-4}};
	
	//찾으면 false 못찾으면 true
	public static boolean watchStu(String newway[][]) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(newway[i][j].equals("T")) {
					
					for(int k=0; k<4; k++) {
						for(int l=0; l<4; l++) {
							int nx = i+dx[k][l];
							int ny = j+dy[k][l];
							
							if(nx<0||nx>=n||ny<0||ny>=n) continue;
							
							else if(newway[nx][ny].equals("O")) break;
							else if(newway[nx][ny].equals("S")) return false;
						}
						
						
					}
				}
			}
		}
		return true;
	} 
	
	public static boolean makeNewway(String way[][],int cnt) {
		
		if(cnt==3) {
			if(watchStu(newway))
				return true;
			else {
				return false;
			}
				
		}
		
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(newway[i][j].equals("X")) {
					
					newway[i][j]="O";
					if(makeNewway(newway, cnt+1)) return true; 
					newway[i][j]="X";
				}
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		sc.nextLine();
		way = new String[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				way[i][j] = sc.next();
			}
		}
		newway = new String[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				newway[i][j] = way[i][j];
			}
		}
		

	}

}
