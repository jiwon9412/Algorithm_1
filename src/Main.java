import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0; j<N; j++) {
			for(int i=0; i<N-1; i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i] ;
					arr[i] = arr[i+1];
					arr[i+1] = temp;				
				}
				
			}	
		}
		for(int i=0; i<N; i++) {
			System.out.println(arr[i]);
		}
		
	}
}