package hevin;

class StudentInfo{
	String name, middlename, lastname, birthdate, address;
	int rollno;
	
	void setData(){
		name = "Hevin";
		middlename = "Mahesh";
		lastname = "Patel";
		birthdate = "16th May 1994";
		address = "17-B Panchvati Society, Navsari";
		rollno = 31;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middlename);
		System.out.println(lastname);
	}
	
	void otherInfo(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollno);
	}
	
	public static void main(String[] a){
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.otherInfo();
	}
}
