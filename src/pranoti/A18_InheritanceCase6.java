package pranoti;

public class A18_InheritanceCase6 {
	
	public static void main(String[] args) {
		A18_Class1StudentInfo student = new A18_Class1StudentInfo();
		A18_Class2College college = new A18_Class2College();
		
		/* college = student; CE --Parent class A18_Class1StudentInfo
		 will not fit in child class A18_Class2College hence complier will throw error */
		
		System.out.println("This is not valid case :Similar as case 4");
	}

}
