package sagarShrikhande;
class Assignemnt2{
	
	String name, middlename, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Sagar";
		middlename = "N";
		surname = "Shrikhande";
		birthdate = "22nd March 1991";
		address = "C2 605 Green County Phase1, Hadapsar, Pune.";
		rollNumber = 7065;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] a){
		Assignemnt2 assignment2 = new Assignemnt2();
		assignment2.setData();
		assignment2.studentName();
		assignment2.studentOtherDetails();
	}
}