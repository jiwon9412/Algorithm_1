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
		
		// ���̰� ���ٸ� �� ���ڸ� compareTo�� ���� ���Ͽ� �����ϰ� ���������� ���̰� ª�� �ͺ��� �����Ѵ�.
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
		//ù��° �ܾ�� ������ ���
		sb.append(arr[0]).append('\n');
		
		//�ٷξ��� �ܾ�͸� ���ؼ� ������ ��������ʴ´�.
		//�̹� ���������� ������ �Ǿ��ֱ⶧���� �ٷξ��� �ܾ�͸� ���ص� �ߺ����� ������ �� �ִ�.
		for(int i=1; i<n; i++) {
			
			if(!arr[i].equals(arr[i-1])){
				sb.append(arr[i]).append('\n');
			}
			
		}
		
		
		System.out.println(sb);
	}
	
	
}