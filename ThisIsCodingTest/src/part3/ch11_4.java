package part3;

import java.util.Arrays;
import java.util.Scanner;

public class ch11_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int [n];
		int arr2[] = new int[1001];
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			arr2[arr[i]]=1;
			int sum=arr[i];
			for(int j=i+1; j<n; j++) {
				sum+=arr[j];
				arr2[sum] = 1;
			}
		}
		
		for(int i=1; i<arr2.length; i++) {
			
			if(arr2[i]==0) {
				System.out.println(i);
				break;
			}
		}

	}

}
