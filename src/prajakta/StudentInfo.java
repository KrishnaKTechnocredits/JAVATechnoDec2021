package prajakta;

class StudentInfo{
    
	String name, middlename, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Prajakta";
		middlename = "Sanjay";
		surname = "Shinde";
		birthdate = "3rd May 1998";
		address = "Sahastrarjun Nagar, Solapur.";
		rollNumber = 1132;
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
		StudentInfo studentInfo = new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}	
}