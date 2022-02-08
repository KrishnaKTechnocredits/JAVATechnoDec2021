package technocredits.interview.p1;

import java.util.ArrayList;
import java.util.List;

public class Client {

	Student getStudentInfo() {
		// DB
		Student student = new Student(1, "Maulik");
		return student;
	}
	
	List<Employee> getAllEmployeeInfo(){
		List<Employee> listOfEmployee = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"Maulik","Kanani","mkanani");
		listOfEmployee.add(e1);
		
		Employee e2 = new Employee(2,"Krishna","Kanani","mkanani");
		listOfEmployee.add(e2);
		
		return listOfEmployee;
	}
	
	
	ArrayList<Student> getAllStudentInfo() {
		// DB
		Student student1 = new Student(1, "Maulik");
		Student student2 = new Student(2, "Pooja");
		Student student3 = new Student(3, "Sandip");
		Student student4 = new Student(4, "Nishika");
		
		ArrayList<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(student1); 
		listOfStudents.add(student2); // student1.equals(student2);
		listOfStudents.add(student3);
		listOfStudents.add(student4);
		return listOfStudents;
	}
	
	public static void main(String[] args) {
		Client client1 = new Client();
		List<Employee> listOfEmployees = client1.getAllEmployeeInfo();
		
		System.out.println(listOfEmployees.size());
		for(Employee e : listOfEmployees) {
			System.out.println(e);
		}
	}
}
