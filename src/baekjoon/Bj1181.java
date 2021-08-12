package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bj1181 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLine();
		}
		//사전순으로 우선 정렬을 시킨다.
		Arrays.sort(arr);

		
		//정렬된 배열에서 길이가 짧은것부터 재배열한다. (이 과정에서 사전순배열은 어차피 다시 바뀌지않으므로)
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a1, String a2) {
					return a1.length() - a2.length();
			}
		});
		//중복된 값을 빼고 출력한다.
		boolean flag = false;
		for(int i=0; i<n; i++) {
			flag = false;
			for(int j=0; j<i; j++) {
				if(arr[i].equals(arr[j])) {
					flag=true;
					break;
				}
			}
			if(!flag)
				sb.append(arr[i]).append('\n');
		}
		System.out.println(sb);
	}
	
	
}