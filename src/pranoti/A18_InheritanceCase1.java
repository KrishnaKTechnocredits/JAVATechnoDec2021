package pranoti;

public class A18_InheritanceCase1 {
	
	public static void main(String[] args) {
		A18_Class1StudentInfo a18 = new A18_Class1StudentInfo();
		System.out.println(a18.name);
		/* System.out.println(a18.deptName); CE --deptName variable is present in child class
		 (A18_Class2College) hence parent class (A18_Class1StudentInfo) can't access 
		 variables of child class */
		
		a18.printAddress();
		
		/*a18.collegeName(); CE --collegeName() method is present in child class
		 (A18_Class2College) hence parent class (A18_Class1StudentInfo) can't access 
		 method of child class */
		
		a18.printRollNumber();
	}
}
