package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bj11651 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		int xy[][] = new int[n][2];
		
		for(int i=0; i<n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();			
		}
		
		Arrays.sort(xy, new Comparator<int []>(){
			public int compare(int []a1, int []a2) {
				if(a1[1] == a2[1]) {
					return a1[0] - a2[0];
				}
				else {
					return a1[1] - a2[1];
				}
			}
		});
		
		for(int i=0; i<n; i++) {
			sb.append(xy[i][0]+" "+xy[i][1]).append('\n');
		}
		System.out.println(sb);
		
	}
	
	
}