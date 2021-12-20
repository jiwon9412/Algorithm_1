package part3;

import java.util.Scanner;

public class ch11_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int arr[] = new int [n];
		int weight[] = new int [m+1];
		
		for(int i=0; i<n; i++) {
			
			int x = sc.nextInt();
			weight[x]++;
		}
		int result=0;
		for(int i=1; i<m; i++) {
			
			for(int j=i+1; j<=m; j++) {
				
				result += weight[i]*weight[j];
			}
		}
		System.out.println(result);
	}

}
