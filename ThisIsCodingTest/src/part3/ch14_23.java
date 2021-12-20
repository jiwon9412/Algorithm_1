package part3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student>{
	
	private int kor,eng,math;
	private String name;
	
	public Student(int kor, int eng, int math, String name) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.kor!=o.kor) return o.kor-this.kor;
		else if(this.eng!=o.eng) return this.eng-o.eng;
		else if(this.math!=o.math) return o.math-this.math;
		else {
			for(int i=0; i<Math.min(this.name.length(), o.name.length()); i++) {
				if(this.name.charAt(i)!=o.name.charAt(i)) {
					return this.name.charAt(i)-o.name.charAt(i);
				}
			}
			return 0;
		}
	}
}


public class ch14_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		for(int i=0; i<n; i++) {
			
			String name = sc.next();
			int kor = sc.nextInt();
			int eng = sc.nextInt();
			int math = sc.nextInt();
			sc.nextLine();
			list.add(new Student(kor, eng, math, name));
		}
		
		Collections.sort(list);
		for(Student s: list) {
			System.out.println(s.getName());
		}

	}

}
