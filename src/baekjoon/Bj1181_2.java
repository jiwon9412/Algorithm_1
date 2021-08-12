package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Bj1181_2 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(sc.nextLine());
		String[] arr = new String[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextLine();
		}
		
		// 길이가 같다면 두 문자를 compareTo를 통해 비교하여 정렬하고 같지않으면 길이가 짧은 것부터 정렬한다.
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a1, String a2) {
				if(a1.length() == a2.length()) {
					return a1.compareTo(a2);
				}
				else {
					return a1.length() - a2.length();
				}
			}
		});
		//첫번째 단어는 무조건 출력
		sb.append(arr[0]).append('\n');
		
		//바로앞의 단어와만 비교해서 같으면 출력하지않는다.
		//이미 사전순으로 정렬이 되어있기때문에 바로앞의 단어와만 비교해도 중복값을 제거할 수 있다.
		for(int i=1; i<n; i++) {
			
			if(!arr[i].equals(arr[i-1])){
				sb.append(arr[i]).append('\n');
			}
			
		}
		
		
		System.out.println(sb);
	}
	
	
}