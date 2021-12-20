package part2;

import java.util.Scanner;

public class ch8_2 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = Integer.parseInt(sc.next());
		
		int []dp = new int[30001];
		
		for(int i=2; i<=x; i++) {
			
			//1빼는걸로 일단 값 설정
			dp[i] = dp[i-1]+1;
			
			//2로 나누어떨어질때 1뺐을때랑 2로 나누었을때 비교해서 더 작은값으로 결정
			if(i%2==0)
				dp[i] = Math.min(dp[i], dp[i/2]+1);
			
			//3으로 나누어떨어질때 1뺐을때랑 3으로 나누었을때 비교해서 더 작은값으로 결정
			//만약 2,3 둘다 나누어떨어지면 그두개도 비교하는거임
			if(i%3==0)
				dp[i] = Math.min(dp[i], dp[i/3]+1);
			
			//5로 나누어떨어질때....
			if(i%5==0)
				dp[i] = Math.min(dp[i], dp[i/5]+1);
			
		}
		
		System.out.println(dp[x]);
		
		
		
		
		

	}

}
