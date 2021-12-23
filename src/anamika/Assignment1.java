package anamika;

public class Assignment1 {
	String name,middleName,surname,birthday,address;
	int rollNumber = 5;
	
	void setData()
	{
		name = "Anamika";
		middleName = "Kumari";
		surname = "Tiwari";
		birthday = "31st march 1993";
		address = "A1-204,wakad";
		rollNumber = 5;
	}
	
	void studentName()
	{
		System.out.println(name+"\n"+middleName+"\n"+surname);
	}
	
	void studentOtherDetails()
	{
		System.out.println(birthday+"\n"+address+"\n"+rollNumber);
	}
	
	public static void main (String[] args) {
		Assignment1 assignment1 = new Assignment1();
		assignment1.setData();
		assignment1.studentName();
		assignment1.studentOtherDetails();
	}
}
  