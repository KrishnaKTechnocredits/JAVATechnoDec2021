package sagarShrikhande;

public class Student extends Admin {
	
	int marks =80;
	String branchName= "IT";
	
	void getDetails() {
		System.out.println("Student.getDetails Method");
	}
	
	void display() {
		System.out.println("Student.display method");
	}
	
	public static void main(String[] args) {
		System.out.println("###################Case1:###################");
		Admin admin = new Admin();
	    //System.out.println(admin.marks);
		System.out.println(admin.cutOffMarks);
		System.out.println(admin.branchName);
		//admin.getDetails();
		admin.display();
		admin.getCutOffMarks();
		
		System.out.println("###################Case2:###################");
		Student student = new Student();
		System.out.println(student.branchName);
		System.out.println(student.cutOffMarks);
		System.out.println(student.marks);
		student.display();
		student.getCutOffMarks();
		student.getDetails();
		
		System.out.println("###################Case3:###################");
		Admin admin1 = new Student();
		//System.out.println(admin1.marks);
		System.out.println(admin1.cutOffMarks); 
		System.out.println(admin1.branchName); //Dynamic Polymorphism during compilation branchName of Admin class loaded  in memory and this property is retained during runtime
		//admin1.getDetails();
		admin1.display();    //Dynamic Polymorphism run time behaviour changed so diaplay method of Student class is called 
		admin1.getCutOffMarks();
		
		System.out.println("###################Case4:###################");
		System.out.println("Compiltation error");
		/* Student student1 = new Admin();  ----> CE here as child cannot child cna not be at left side
		
		//System.out.println(admin1.marks);
		System.out.println(admin1.cutOffMarks); 
		System.out.println(admin1.branchName); //Dynamic Polymorphism during compilation branchName of Admin class loaded  in memory and this property is retained during runtime
		//admin1.getDetails();
		admin1.display();    //Dynamic Polymorphism run time behaviour changed so diaplay method of Student class is called 
		admin1.getCutOffMarks(); */
	
		
		System.out.println("###################Case5:###################");
		Admin admin2 = new Admin();
		Student student2 = new Student();
		admin2 = student2;
		//System.out.println(admin2.marks);
		System.out.println(admin2.cutOffMarks); 
		System.out.println(admin2.branchName); //Dynamic Polymorphism during compilation branchName of Admin class loaded  in memory and this property is retained during runtime
		//admin2.getDetails();
		admin2.display();    //Dynamic Polymorphism run time behaviour changed so diaplay method of Student class is called 
		admin2.getCutOffMarks();
		
		System.out.println("###################Case6:###################");
		Admin admin3 = new Admin();
		Student student3 = new Student();
		student3 = (Student) admin3;
		System.out.println(student3.marks);
		System.out.println(student3.cutOffMarks); 
		System.out.println(student3.branchName); 
		student3.getDetails();
		student3.display();    
		student3.getCutOffMarks();

	}
}
