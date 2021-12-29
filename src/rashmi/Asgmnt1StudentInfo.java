package rashmi;

public class Asgmnt1StudentInfo {
	String name, middlename, surname, birthdate, address;
	int rollNumber;
	
	void setData(){
		name = "Rashmi";
		middlename = "Ravindra";
		surname = "Bante";
		birthdate = "10th Aug 1995";
		address = "Nagpur";
		rollNumber = 10;
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
		Asgmnt1StudentInfo asgmnt1studentinfo = new Asgmnt1StudentInfo();
		asgmnt1studentinfo.setData();
		asgmnt1studentinfo.studentName();
		asgmnt1studentinfo.studentOtherDetails();
	}
}
