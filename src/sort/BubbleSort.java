package sort;

public class BubbleSort {
	
	public static void bubbleSort(int []arr) {
		
		boolean doSwap = false;
		
		for(int i=1; i<arr.length; i++) {
			
			for(int j=0; j<arr.length - i; j++) {
				
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
					doSwap = true;
				}
			}
			if(!doSwap) break;
		}
		
	}

	public static void swap(int []arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 0, 6, 5, 0, 1, 2, 11, 19};
		bubbleSort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
