package baekjoon;

import java.util.Scanner;


public class Bj1427 {

	public static void main(String[] args) {
		
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
		String N = sc.nextLine();
		int[] arr = new int[N.length()];
		
		for(int i=0; i<N.length(); i++) {
			arr[i] =  N.charAt(i) - '0';
		}
		
		for(int i=1; i<arr.length; i++) {
			int target = arr[i];
			int j = i-1;
			
			while(j>=0 && target > arr[j]) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = target;
		}
		for(int i=0;i<arr.length;i++) {
			sb.append(arr[i]);	
		}
		
		
		System.out.println(sb);
		sc.close();
		
	}
}