package part2;

import java.util.Scanner;

public class ch7_2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int []arr = new int [1000001];
		
		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(sc.next())]++;
		}
		
		int m = Integer.parseInt(sc.next());
		int []check = new int[m];
		for(int i=0; i<m; i++) {
			check[i] = Integer.parseInt(sc.next());
		}
		
		for(int i=0; i<m; i++) {
			if(arr[check[i]]==0) {
				System.out.print("no ");
			}else {
				System.out.print("yes ");
			}
		}

	}

}
