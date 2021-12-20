package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Bj11650 {

	public static void main(String[] args)  {
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int [][]xy= new int[n][2];
		
		//x좌표, y좌표 받아서 2차원 배열에 넣기
		for(int i=0; i<n; i++) {
			xy[i][0] = sc.nextInt();
			xy[i][1] = sc.nextInt();
		}
		
		//Arrays.sort(T[] a, Comparator<T>c) 이용해서 정렬 -> Comparator파라미터로 넘어온c의 비교기준을 갖고
		// 파라미터로 넘어온 객체배열 a를 정렬하겠다는 의미
//		Arrays.sort(xy, new Comparator<int[]>(){
//			public int compare(int[] a1, int []a2) {
//				if(a1[0]==a2[0]) {                  // x좌표가 같으면
//					return a1[1] - a2[1];           // y좌표로 비교한다는 의미
//				}
//				else {
//					return a1[0] - a2[0];           //x좌표가 같은게 아니라면 x좌표로 비교
//				}
//			}        
//		});        //Arrays.srot는 비교기준에서 비교값이 양수면 위치변경, 음수면 그대로 둠 
		
		//위의 식을 람다식으로 변환하면 더 간단한 코딩가능
		Arrays.sort(xy, (a1,a2)->{
			if(a1[0]==a2[0]) {                  // x좌표가 같으면
				return a1[1] - a2[1];           // y좌표로 비교한다는 의미
			}
			else {
				return a1[0] - a2[0];           //x좌표가 같은게 아니라면 x좌표로 비교
			}
		});
		
		//출력
		for(int i=0; i<n; i++) {
			sb.append(xy[i][0]+" "+xy[i][1]).append('\n');
		}
		System.out.println(sb);
		
		
		
	}
	
	
}