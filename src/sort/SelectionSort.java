package sort;

public class SelectionSort {
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void selectionSort(int[] arr) {
		
		for(int i=0; i<arr.length-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr, i, minIndex);
		}
	}
	
	

	public static void main(String[] args) {
		int[] arr = {1, 0, 6, 5, 0, 1, 2, 11, 19};
		selectionSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
