package part3;

import java.util.Scanner;

public class ch11_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int arr[] = new int [str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		int cntZero=0;
		int cntOne=0;
		int now = arr[0];
		if(now==1) cntOne++;
		else if(now==0) cntZero++;
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i]==now) continue;
			else {
				now=arr[i];
				if(now==1) cntOne++;
				else if(now==0) cntZero++;
			}
		}
		int result = Math.min(cntOne, cntZero);
		System.out.println(result);
	}

}
