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
	
	//toString() �޼ҵ�� ��ü�� ����� ��, ������� ���Ƿ� ����ϰ��� �ϴ� ���ڿ��� ������ �� �ִ�.
	// ��ü�迭�� ��ü�� ����ϸ� �ش� �ε����� ��ü�� toString() �� ��� ��
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
		// ��ü�迭�� ��ü�� ����ϸ� �ش� �ε����� ��ü�� toString() �� ��� ��
		for(int i=0; i<n; i++) {
			sb.append(p[i]);
		}
		System.out.println(sb);
	
	}

}
