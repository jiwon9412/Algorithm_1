package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bj10814 {
	public static void main(String[] args) {
    
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		
 
		int n = Integer.parseInt(sc.nextLine());
		String[][] arr = new String[n][2];
		
		for(int i=0; i<n; i++) {
			arr[i][0]= sc.next();
			arr[i][1]= sc.next();
		}
		
		Arrays.sort(arr, new Comparator<String[]>(){
			public int compare(String[] a1, String[]a2) {
				
				return Integer.parseInt(a1[0]) - Integer.parseInt(a2[0]);
			}
		});
		
		for(int i=0; i<n; i++) {
			sb.append(arr[i][0]+" "+arr[i][1]).append('\n');
		}
		
		System.out.println(sb);
	}
 
}