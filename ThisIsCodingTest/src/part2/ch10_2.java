package part2;

import java.util.Scanner;

public class ch10_2 {
	
	public static int[] team;
	
	public static int findTeam(int x) {
		
		if(team[x] == x) return x;
		else return findTeam(team[x]);
	}
	
	public static void unionTeam(int a, int b) {
		
		a = findTeam(a);
		b = findTeam(b);
		if(a<b) team[b] = a;
		else team[a] = b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		team = new int[n+1];
		for(int i=0; i<=n; i++) {
			team[i] = i;
		}
		
		for(int i=0; i<m; i++) {
			
			int cmd = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(cmd==0) {
				unionTeam(a, b);
			}else {
				if(findTeam(a)==findTeam(b))
					sb.append("YES\n");
				else
					sb.append("NO\n");
			}
			
		}
		System.out.println(sb);
	}

}
