package sort;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		
		for(int i=1; i<arr.length; i++) {
			
			int target = arr[i];
			
			int j = i - 1;
			
			while(j >= 0 && target < arr[j]) {
			
				arr[j + 1] = arr[j];	
				j--;
			}
			
			arr[j+1] = target;
		}
	
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {1, 0, 6, 5, 0, 1, 2, 11, 19};
		insertionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
