package part2;

import java.util.Scanner;

public class ch7_binarySearch {
	
	public static int binarySearch(int []arr, int target, int start, int end) {
		
		if(start>end) return -1;
		
		int mid = (start+end)/2;
		
		//중간값이 타겟과 같은면 그 값 리턴
		if(arr[mid]==target) return mid;
		
		//중간값이 타겟보다 크면 중간값 이전 값들 확인
		else if(arr[mid]>target)
			return binarySearch(arr, target, start, mid-1);
		//중간값이 타겟보다 작으면 중간값 이후 값들 확인
		else
			return binarySearch(arr, target, mid+1, end);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		  // 원소의 개수(n)와 찾고자 하는 값(target)을 입력받기 
        int n = sc.nextInt();
        int target = sc.nextInt();

        // 전체 원소 입력받기 
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 이진 탐색 수행 결과 출력 
        int result = binarySearch(arr, target, 0, n - 1);
        if (result == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        }
        else {
            System.out.println(result + 1);
        }

	}

}
