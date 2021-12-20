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
		//���������� �켱 ������ ��Ų��.
		Arrays.sort(arr);

		
		//���ĵ� �迭���� ���̰� ª���ͺ��� ��迭�Ѵ�. (�� �������� �������迭�� ������ �ٽ� �ٲ��������Ƿ�)
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String a1, String a2) {
					return a1.length() - a2.length();
			}
		});
		//�ߺ��� ���� ���� ����Ѵ�.
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