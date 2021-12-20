package part2;

import java.util.Arrays;
import java.util.Scanner;

public class ch7_2 {
	
	public static int checkNum(int[] arr, int target, int start, int end) {
		
		if(start>end) return -1;
		
		int mid = (start+end)/2;
		
		if(arr[mid]==target) return arr[mid];
		else if(arr[mid]<target) return checkNum(arr, target, mid+1, end);
		else return checkNum(arr, target, start, mid-1);
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(sc.next());
		int []store = new int[n];
		
		for(int i=0; i<n; i++) {
			store[i] = Integer.parseInt(sc.next());
		}
		Arrays.sort(store);
		
		int m = Integer.parseInt(sc.next());
		

		for(int i=0; i<m; i++) {
			int check = Integer.parseInt(sc.next());
			
			if(checkNum(store, check, 0, n-1)==-1) {
				sb.append("no ");
			}else {
				sb.append("yes ");
			}
			
		}
		System.out.println(sb);
	}

}
