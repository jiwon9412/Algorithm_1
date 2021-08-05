package baekjoon;

import java.util.Scanner;


public class Bj1427_2 {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		int[] cnt = new int[10];
		
		for(int i=0; i<N.length(); i++) {
			cnt[N.charAt(i) - '0']++;
		}
		for(int i=9; i>=0; i--) {
			while(cnt[i]-->0) {
				sb.append(i);	
			}
			
		}
		
		System.out.println(sb);
		sc.close();
		
	}
}