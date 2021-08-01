import java.util.Scanner;
 
public class UseStringBuilder {
 
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
 
		int N = sc.nextInt();
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	/*
		N : ������ ���� 
		start : ����� 
		mid : �ű�� ���� �̵��ؾ� ��� 
		to : ������
	 */
 
	public static void Hanoi(int N, int start, int mid, int to) {
		// �̵��� ������ ���� 1�����?
		if (N == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		// STEP 1 : N-1���� A���� B�� �̵�
		Hanoi(N - 1, start, to, mid);
		
		// STEP 2 : 1���� A���� C�� �̵�
		sb.append(start + " " + to + "\n");
		
		// STEP 3 : N-1���� B���� C�� �̵�
		Hanoi(N - 1, mid, start, to);
 
	}
}