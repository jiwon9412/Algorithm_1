package part2;

public class ch6_countSort {

	public static void main(String[] args) {
		
		int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
		int[] cnt = new int [10];
		
		for(int i:arr) {
			cnt[i]++;
		}
		
		for(int i=0; i<10; i++) {
			
			for(int j=0; j<cnt[i]; j++) {
				System.out.print(i+" ");
			}
		}
		

	}

}
