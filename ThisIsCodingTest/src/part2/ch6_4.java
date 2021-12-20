package part2;

import java.util.Arrays;
import java.util.Scanner;

public class ch6_4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		
		int []a = new int[n];
		int []b = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}
		
		for(int i=0; i<n; i++) {
			b[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0; i<k; i++) {
			if(a[i]>b[n-1-i])
				break;
			int temp = a[i];
			a[i] = b[n-1-i];
			b[n-1-i] = temp;
		}
		int sum=0;
		for(int s:a) {
			sum+=s;
		}
		System.out.println(sum);
		
	}

}
