package part2;

public class ch6_quickSort {
	
	public static void quick(int []arr, int start, int end) {
		
		if(start>=end) return;
		int pivot = start;
		int left = start+1;
		int right = end;
		
		while(left<=right) {
			
			
			while (left <= end && arr[left] <= arr[pivot]) left++;
            while (right > start && arr[right] >= arr[pivot]) right--;
			if(left>right) {
				int temp = arr[pivot];
				arr[pivot] = arr[right];
				arr[right] = temp;
			}else {
				int temp = arr[right];
				arr[right] = arr[left];
				arr[left] = temp;
			}
			
		}
		quick(arr,start,right-1);
		quick(arr,right+1,end);
		
	}

	public static void main(String[] args) {
		
		int []arr = {7,5,9,0,3,1,6,2,4,8};
		
		quick(arr,0,arr.length-1);
		
		for(int i: arr) {
			System.out.print(i+" ");
		}
		

	}

}
