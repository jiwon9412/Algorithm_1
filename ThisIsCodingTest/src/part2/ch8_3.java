package part2;

import java.util.Scanner;

public class ch8_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		int []dx = new int[101];
		int []house = new int[n];
		
		for(int i=0; i<n ;i++) {
			house[i] = Integer.parseInt(sc.next());
		}
		dx[0]=house[0];
		dx[1]=Math.max(house[0], house[1]);
		
		for(int i=2; i<n; i++) {
			dx[i] = Math.max(dx[i-2]+house[i], dx[i-1]);
		}
		
		System.out.println(dx[n-1]);
	

	}

}
