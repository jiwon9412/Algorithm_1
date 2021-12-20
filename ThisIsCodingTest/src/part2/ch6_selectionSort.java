package part2;

public class ch6_selectionSort {

	public static void main(String[] args) {
		
		int []arr = {7,5,9,0,3,1,6,2,4,8};
		
		for(int i=0; i<arr.length-1; i++) {
			
			int min_index=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[min_index]>arr[j]) {
					
					min_index=j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_index];
			arr[min_index]=temp;
		}
		for(int i: arr) {
			System.out.println(i+" ");
		}
	}

}
