package technocredits.interview.p1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Student student1 = new Student(1,"Anvit");
		Student student2 = new Student(2,"Pooja");
		Student student3 = new Student(3,"Yogesh");
		Student student4 = new Student(1,"Anvit");
		Student student5 = new Student(1,"Maulik");
		
		List<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(student1);
		listOfStudent.add(student2);  
		listOfStudent.add(student3);  
		listOfStudent.add(student4); 
		
		System.out.println(listOfStudent.size()); // 3 or 4 : 4
		
		HashSet<Student> setOfStudents = new HashSet<Student>();
		setOfStudents.add(student1);
		setOfStudents.add(student2); //student1.hashCode() == student2.hashCode() // student1.equals(student2)
		setOfStudents.add(student3); // student1.equals(student3) // student2.equals(student3)
		setOfStudents.add(student4);// 
		setOfStudents.add(student5);
		
		System.out.println(student1.hashCode());
		System.out.println(student4.hashCode());
		
		System.out.println(setOfStudents.size()); // 4
		
		String str1 = "Hi";
		String str2 = "Hi";
		
		str1.equals(str2);
	}
}
