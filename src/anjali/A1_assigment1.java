package anjali;

public class A1_assigment1 {

	public static void main(String[] args) {
		A1_assigment1  studentInfo = new A1_assigment1 ();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
	String name, middleName, surName, birthDate, address;
	int rollNumber;
	
	void setData(){
		name= "Anjali";
		middleName="Bapurao";
		surName="Bidkar";
		birthDate= "01/06/1993";
		address= "Shivdarshan society ,chaudhari park ,wakad 411047";
		rollNumber= 4023;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surName);
	}
	
	void studentOtherDetails(){
		System.out.println(birthDate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

}
