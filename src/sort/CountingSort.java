package sort;

public class CountingSort {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		int []cnt = new int[31];
		int[] result = new int[100];

		for(int i=0; i<array.length; i++) {
			array[i] = (int)(Math.random()*31);
		}
		
		for(int i=0; i<array.length; i++) {
			cnt[array[i]]++;
		}
		
		for(int i=1; i<cnt.length; i++) {
			cnt[i] += cnt[i-1];
		}
		
		for(int i=array.length -1; i>=0;i--) {
			
			result[--cnt[array[i]]] = array[i];
		}
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i]+" ");
		}
		
		
	}

}
