package pranoti;

public class A18_InheritanceCase5 {
	
	public static void main(String[] args) {
		A18_Class1StudentInfo student = new A18_Class1StudentInfo();
		A18_Class2College college = new A18_Class2College();
		student = college;
		System.out.println(student.name);
		student.printAddress();
		
		/* System.out.println(student.clgName); CE --Complier only see left side i.e A18_Class1StudentInfo student
		clgName variable is not visible to reference variable student hence it will throw error during compilation */
		
		/* student.printdeptId(); CE --Complier only see left side i.e A18_Class1StudentInfo student
		printdeptId() method is not visible to reference variable student hence it will throw error during compilation */
		
		System.out.println("Case 5 is similar to case 3");
	}
}
