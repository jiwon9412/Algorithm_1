package part3;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ch14_26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Queue<Integer> q = new PriorityQueue<Integer>();
		
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			q.offer(x);
		}
		
		
		int result=0;
        int sum=0;
		while(q.size()!=1) {
			
			int a = q.poll();
			int b = q.poll();
			sum+=a+b;
			result=sum;
			q.offer(a+b);
			
		}
		
		System.out.println(result);
		

	}

}