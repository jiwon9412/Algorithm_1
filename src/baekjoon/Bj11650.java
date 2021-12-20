package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj11650 {

	public static void main(String[] args)  {
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [][]xy= new int[n][2];
		
		//x��ǥ, y��ǥ �޾Ƽ� 2���� �迭�� �ֱ�
		for(int i=0; i<n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		
		//Arrays.sort(T[] a, Comparator<T>c) �̿��ؼ� ���� -> Comparator�Ķ���ͷ� �Ѿ��c�� �񱳱����� ����
		// �Ķ���ͷ� �Ѿ�� ��ü�迭 a�� �����ϰڴٴ� �ǹ�
//		Arrays.sort(xy, new Comparator<int[]>(){
//			public int compare(int[] a1, int []a2) {
//				if(a1[0]==a2[0]) {                  // x��ǥ�� ������
//					return a1[1] - a2[1];           // y��ǥ�� ���Ѵٴ� �ǹ�
//				}
//				else {
//					return a1[0] - a2[0];           //x��ǥ�� ������ �ƴ϶�� x��ǥ�� ��
//				}
//			}        
//		});        //Arrays.srot�� �񱳱��ؿ��� �񱳰��� ����� ��ġ����, ������ �״�� �� 
		
		//���� ���� ���ٽ����� ��ȯ�ϸ� �� ������ �ڵ�����
		Arrays.sort(xy, (a1,a2)->{
			if(a1[0]==a2[0]) {                  // x��ǥ�� ������
				return a1[1] - a2[1];           // y��ǥ�� ���Ѵٴ� �ǹ�
			}
			else {
				return a1[0] - a2[0];           //x��ǥ�� ������ �ƴ϶�� x��ǥ�� ��
			}
		});
		
		//���
		for(int i=0; i<n; i++) {
			sb.append(xy[i][0]+" "+xy[i][1]).append('\n');
		}
		System.out.println(sb);
		
		
		
	}
	
	
}