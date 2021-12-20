package part3;

import java.util.Arrays;
import java.util.Collections;


import java.util.Scanner;

public class ch11_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		
		int cnt=0;
		int result=0;
		for(int i=0; i<arr.length; i++) {
			
			cnt++;
			if(arr[i]<=cnt) {
				result++;
				cnt=0;
			}
		}
		
		System.out.println(result);
		
	}

}
