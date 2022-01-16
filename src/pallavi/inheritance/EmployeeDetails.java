package pallavi.inheritance;

public class EmployeeDetails extends EmployeeMaster {
	int empId = 2222;
	String empDesignation = "Manager";
	int empExp = 15;

	void setEmployeeExp(String designt, int exp) {
		empDesignation = designt;
		empExp = exp;
	}

	void getEmployeeInfo() {
		System.out.println("Desiognation:- " + empDesignation);
		System.out.println("Exp:-" + empExp + " yrs");
	}

}
