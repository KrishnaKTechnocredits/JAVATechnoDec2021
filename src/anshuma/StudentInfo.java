package anshuma;

class StudentInfo{
	
	String name, middlename, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Anshuma";
		middlename = "Surendra";
		surname = "Ikhare";
		birthdate = "21st june 1997";
		address = "Narayan Niwas,Wani, yavatmal, 445304";
		rollNumber = 12;
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
	
	public static void main (String args[]){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}