package baekjoon;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Person{
	
	int age;
	String name;
	
	public Person(int age, String name) {
		
		this.age = age;
		this.name = name;
	}
	
	//toString() 메소드는 객체를 출력할 때, 사용자의 임의로 출력하고자 하는 문자열을 지정할 수 있다.
	// 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
	public String toString() {
		return age + " " + name + '\n';
	}
	
}

public class Bj10814_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(sc.nextLine());
		Person[] p = new Person[n];
		
		for(int i=0; i<n; i++) {
			p[i] = new Person(sc.nextInt(),sc.next());
		}
		
		Arrays.sort(p, new Comparator<Person>() {
			
			public int compare(Person p1, Person p2) {
				return p1.age - p2.age;
			}
			
		});
		// 객체배열의 객체를 출력하면 해당 인덱스의 객체의 toString() 이 출력 됨
		for(int i=0; i<n; i++) {
			sb.append(p[i]);
		}
		System.out.println(sb);
	
	}

}
