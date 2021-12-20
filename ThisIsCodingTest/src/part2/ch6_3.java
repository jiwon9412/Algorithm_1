package part2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Student{
	
	String name;
	int score;
	
	public Student(String name, int score) {
		
		this.name = name;
		this.score = score;
	}
	
}

public class ch6_3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		Student []arr = new Student[n];
		
		for(int i=0; i<n; i++) {
			String name = sc.next();
			int score = Integer.parseInt(sc.next());
			arr[i] = new Student(name,score );
		}
		
		Comparator<Student> comp = new Comparator<Student>() {
			
			@Override
			public int compare(Student o1, Student o2) {

				return o1.score-o2.score;
			}
		};
		
		Arrays.sort(arr,comp);
		
		for(Student s:arr) {
			System.out.print(s.name+" ");
		}
		
	}

}
