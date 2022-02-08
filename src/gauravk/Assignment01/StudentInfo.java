package gauravk.Assignment01;
/*
 * Assignment -1 : 13th Dec’21

Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

1. Create class called “StudentInfo”
2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
3. Create method called setData to set value of instance variable. Create another two methods called studentName() and studentOtherDetails()
4. studentName() method should print details like Name, middle name, surname.
5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
6. Create main method.
7. write a logic in main method.
	a. Create object of StudentInfo class.
	b. call studentName() and studentOtherDetails() method on reference variable
8. Compile & Run

Output example : 
Shikha
Amit
Patel
10th Aug 1998
G-809, Heaven Apartment, Baner, Pune.
34

Note : birthdate and address should be String.
—-------------------------------------------------------------------------------------------

 */
public class StudentInfo {
	
	String name, middleName, surname;
	String birthdate;
	String address;
	int rollNo;
	
	void setData(String fName, String mName, String sName, String address, String dob, int roll) {
		this.name=fName;
		this.middleName=mName;
		this.surname=sName;
		this.address=address;
		this.birthdate=dob;
		this.rollNo=roll;
	}
	
	void studentName() {
		System.out.println(name+"\n"+middleName+"\n"+surname);
	}
	
	void studentOtherDetails() {
		System.out.println(birthdate+"\n"+address+"\n"+rollNo);
	}
	
	public static void main(String[] args) {
		
		StudentInfo s = new StudentInfo();
		s.setData("Gaurav", "Maganlal", "Kothadia", "11 - Barra Wood Close, Hayes UB3 2UJ", "20th Oct 1980", 14);
		s.studentName();
		s.studentOtherDetails();
		
	}
}
