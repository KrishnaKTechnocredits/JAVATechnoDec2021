package pranoti;

public class A18_Class2College extends A18_Class1StudentInfo {

	String clgName = "AMGOI";
	String address = "Vathar,L-505";
	int deptId = 1011;
	String deptName = "CSE";

	void collegeName() {
		System.out.println("college name is : " + clgName);
	}

	void printdeptId() {
		System.out.println("Department id is : " + deptId);
	}

	void printAddress() {
		System.out.println("college address is : " + address);
	}

	void printdeptName() {
		System.out.println("Departmenat name is : " + deptName);
	}
}