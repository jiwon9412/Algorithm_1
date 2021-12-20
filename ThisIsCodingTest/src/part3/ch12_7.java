package part3;

import java.util.Scanner;

public class ch12_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int sum = 0;
		int sum2=0;
		int l = str.length();
		for(int i=0; i<l/2; i++) {
			
			sum+=str.charAt(i)-'0';
		}
		
		for(int i=l/2; i<l; i++) {
			sum2+=str.charAt(i)-'0';
		}
		
		if(sum==sum2) {
			System.out.println("LUCKY");
		}else {
			System.out.println("READY");
		}
	}

}
