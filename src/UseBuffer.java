import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class UseBuffer {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
        br.readLine();		
		int cnt = 0;
		st = new StringTokenizer(br.readLine()); 

		
		while(st.hasMoreTokens()) {   // 현재 남은 토큰이 없다면 반목문 STOP
        
			boolean isPrime = true;
			
			int num = Integer.parseInt(st.nextToken());
			
			if(num == 1) {
				continue;
			}
			for(int i = 2; i <= Math.sqrt(num); i++) {
				if(num % i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}