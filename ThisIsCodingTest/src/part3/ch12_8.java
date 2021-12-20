package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ch12_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		ArrayList<Character> list = new ArrayList<Character>();
		int sum=0;
		
		for(int i=0; i<str.length(); i++) {
			
			char c = str.charAt(i);
			if(c>='A'&&c<='Z') {
				list.add(c);
			}else {
				sum += c-'0';
			}
		}
		Collections.sort(list);
		for(char x : list) {
			System.out.print(x);
		}
		System.out.print(sum);
	}

}
