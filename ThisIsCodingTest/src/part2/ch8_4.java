package part2;

import java.util.Scanner;

public class ch8_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		
		int []dx = new int[1001];
		dx[1] = 1;
		dx[2] = 3;
		
		for(int i=3; i<=n; i++) {
			dx[i] = (dx[i-1]+dx[i-2]*2)%796796;
		}
		
		System.out.println(dx[n]);

	}

}
