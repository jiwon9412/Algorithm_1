package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ch13_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		Queue<Integer> q = new LinkedList<Integer>();
		int []dist = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			dist[i] = -1;
			list.add(new ArrayList<Integer>());
		}
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list.get(a).add(b);
		}
		dist[x]=0;
		q.offer(x);
		
		while(!q.isEmpty()) {
			
			int idx = q.poll();
			for(int i=0; i<list.get(idx).size(); i++) {
				int c = list.get(idx).get(i);
				if(dist[c]!=-1) continue;
				
				q.offer(c);
				dist[c]=dist[idx]+1;
				
			}
			
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i=0; i<=n; i++) {
			if(dist[i]==k) result.add(i);
		}
		
		if(result.size()==0)
			System.out.println(-1);
		else {
			Collections.sort(result);
			for(int i:result) {
				System.out.println(i);
			}
		}

	}

}
