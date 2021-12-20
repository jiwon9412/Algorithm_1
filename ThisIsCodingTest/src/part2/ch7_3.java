package part2;

import java.util.Arrays;
import java.util.Scanner;

public class ch7_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int m = Integer.parseInt(sc.next());
		int []arr = new int [n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		int start = 0;
		int end = arr[n-1];
		
		int result=0;
		while(start<=end) {
			int sum=0;
			int mid=(start+end)/2;
			for(int i=0; i<n; i++) {
				if(arr[i]<mid) continue;
				sum+=(arr[i]-mid);
			}
			if(sum<m) end=mid-1;
			else {
				result=mid;
				start=mid+1;
			}
		}
		System.out.println(result);

	}

}
