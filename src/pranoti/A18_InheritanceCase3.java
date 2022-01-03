package pranoti;

public class A18_InheritanceCase3 {

	public static void main(String[] args) {
		A18_Class1StudentInfo a18 = new A18_Class2College();
		System.out.println(a18.name);
		
		/* System.out.println(a18.clgName); CE --Complier only see left side i.e A18_Class1StudentInfo a18
		clgName variable is not visible to reference variable a18 hence it will throw error during compilation */
		
		a18.printAddress();//dynamic polymorphism --compile time to runtime method behavior will change 
		
		/* a18.printdeptId(); CE --Complier only see left side i.e A18_Class1StudentInfo a18
		printRollNumber() method is not visible to reference variable a18 hence it will throw error during compilation*/
		
		System.out.println("Student address is : " +a18.address);
	}
}
