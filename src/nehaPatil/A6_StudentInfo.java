package nehaPatil;
class A6_StudentInfo{
    String name;
	String midname;
	String surname;
	String birthdate;
	String address;
	int rollNumber;
	  
	void setData(){
	    name ="shikha";
	    midname = "amit";
	    surname = "patel";
	    birthdate = "10th aug 1998";
	    address ="G-809,heavan appt";
	    rollNumber = 34;
    }
	 
    void studentName() {
	    System.out.println(name);
		System.out.println(midname);
		System.out.println(surname);
	}

	void studentOtherDetails() {
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}

	public static void main(String[] args) {
		A6_StudentInfo studentInfo = new A6_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
    }
}
