package part3;

import java.util.Scanner;
//혼자 다시 풀어봐야됨 .. 답본거
public class ch13_19 {
	
	public static int n;
	public static int[]arr;
	public static int max;
	public static int min;
	
	public static int plus,minus,mul,divi;
	
	public static void cal(int i,int now) {
		
		if(i==n) {
			max = Math.max(max, now);
			min = Math.min(min, now);
		}else {
			
			if(plus>0) {
				plus--;
				cal(i+1,now+arr[i]);
				plus++;
			}
			if(minus>0) {
				minus--;
				cal(i+1,now-arr[i]);
				minus++;
			}
			if(mul>0) {
				mul--;
				cal(i+1,now*arr[i]);
				mul++;
			}
			if(divi>0) {
				divi--;
				cal(i+1,now/arr[i]);
				divi++;
			}
		}
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt();
		arr = new int[n];
		max = (int)-1e9;
		min = (int)1e9;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		plus=sc.nextInt();
		minus=sc.nextInt();
		mul=sc.nextInt();
		divi=sc.nextInt();
		
		cal(1,arr[0]);
		
		System.out.println(max);
		System.out.println(min);
		
		
		

	}

}
