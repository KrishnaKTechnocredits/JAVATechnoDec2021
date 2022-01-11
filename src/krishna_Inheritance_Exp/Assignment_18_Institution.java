package krishna_Inheritance_Exp;

public class Assignment_18_Institution extends Assignment_18_Candidate {
	String instituteName = "St Xavier College";
	String candidateName = "Krrishaw";
	String branch = "MCA";
	String city = "Kolkata";
	String address = "Park Street";
	int code = 10012;

	void displayInsName() {
		System.out.println("Institute Name : " + instituteName);
	}

	void displayCandName() {
		System.out.println("Candidate Name : " + candidateName);
	}

	void code() {
		System.out.println("Branch : " + branch);
	}

	void branch() {
		System.out.println("Code : " + code);
	}

	void address() {
		System.out.println("Address : " + address);
	}

	void city() {
		System.out.println("City : " + city);
	}
}
