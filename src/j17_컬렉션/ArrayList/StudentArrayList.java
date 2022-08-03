package j17_컬렉션.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import j15_스태틱.Student;

public class StudentArrayList {

	public static void main(String[] args) {

		Student student1 = new Student("조문기");
		Student student2 = new Student("김호영");
		Student student3 = new Student("서재효");
		Student student4 = new Student("신승한");
		Student student5 = new Student("전나경");
		
		
		/*
		 * studentList
		 * student 배열을 생성하고 그 배열을 리스트로 변환 후
		 * 새로운 ArrayList를 생성하여 전체를 추가
		 * 
		 */

		
		
		Student[] students = {student1, student2,student3,student4,student5};

		System.out.println(students);	
		
		ArrayList<Student> studentlist = new ArrayList<Student>();

		studentlist.addAll(Arrays.asList(students));
		
		
		for(Student student: studentlist) {
			System.out.println(student);
		}
		
		System.out.println(studentlist);
		
		
		/*
		 *  학생 이름이 서재효인 객체를 찾아서
		 *  출력하고 삭제
		 */
		System.out.println("-----------");

		System.out.println(studentlist);
		
		
		for(int i = 0; i < studentlist.size();i++) {
			Student student = studentlist.get(i);
			
			if(studentlist.get(i).getName().equals("서재효")) {
				System.out.println(studentlist);
				studentlist.remove(i);
			}
		}
		
		
		System.out.println(studentlist);

	}

}
