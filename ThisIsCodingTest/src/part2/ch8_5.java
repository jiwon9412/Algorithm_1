package part2;

import java.util.Arrays;
import java.util.Scanner;

public class ch8_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();
		
		int []arr = new int[n];
		int []dx = new int[m+1];
		Arrays.fill(dx, 10001);
		dx[0]=0;
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(sc.nextLine());
		}
		
		
		
		for(int i=0; i<n; i++) {
			for(int j=arr[i]; j<m+1; j++) {
				if(dx[j-arr[i]]!=10001)
					dx[j] = Math.min(dx[j], dx[j-arr[i]]+1);
			}
		}
		if(dx[m]==10001) 
			System.out.println(-1);
		else 
			System.out.println(dx[m]);
		
	}

}
