package nishika;

public class A2_assignment2 {

	String Name,middlename,surname,birthdate,address;
	int    rollnumber;
	
	void setData(){
		Name="shikha";
		middlename="amit";
		surname="patel";
		birthdate="10th aug 1998";
		address="G-809, Heaven Apartment Baner, pune";
		rollnumber=34;	
	}
	
	void studentName(){
		System.out.println(Name);
		System.out.println(middlename);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollnumber);
	}
	
	public static void main(String[] args){
		A2_assignment2 a2_assignment2 = new A2_assignment2();
		a2_assignment2.setData();
		a2_assignment2.studentName();
		a2_assignment2.studentOtherDetails();
	}

}
