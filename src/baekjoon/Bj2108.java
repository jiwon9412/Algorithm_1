package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Bj2108 {

	public static void main(String[] args) throws IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		int []cnt = new int[8002];
		int []result = new int[N];
		
		for(int i=0; i<N; i++) {
			cnt[Integer.parseInt(br.readLine())+4000]++;
		}
		int[] modeArr = new int[N];
		int max=1;
		int m = 0;
		int mode = 0;
		for(int i=0; i<8002; i++) {
			if(cnt[i]>=max) {
				max = cnt[i];
				}
		}
		for(int i=0; i<8002; i++) {
			if(cnt[i]==max) {
				modeArr[m] = i-4000;
				m++;
				}
		}
		if(m>1) mode = modeArr[1];
		else if (m==1) mode = modeArr[0];
		
		int j=0;
		for(int i=0; i<8002; i++) {
			while(cnt[i]>0) {
				
				result[j]=i-4000;
				cnt[i]--;
				j++;
			}
		}
		
		
		int sum=0;
		for(int i=0; i<N; i++) {
			sum += result[i];
		}
		int avg = (int)Math.round((double)sum/N);
		int mid = result[result.length/2];
		int range = result[result.length-1] - result[0];
		
		sb.append(avg).append('\n');
		sb.append(mid).append('\n');
		sb.append(mode).append('\n');
		sb.append(range).append('\n');
		
		System.out.println(sb);
		
		
		
		
		
	}
}