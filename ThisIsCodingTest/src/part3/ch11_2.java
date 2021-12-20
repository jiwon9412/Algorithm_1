package part3;

import java.util.Scanner;

public class ch11_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		int arr[] = new int[str.length()];
		
		for(int i=0; i<str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		
		int result=arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]<=1 || result<=1)
				result+=arr[i];
			else {
				result*=arr[i];
			}
		}
		System.out.println(result);
	}

}
