/* Assignment -1 : 13th Dec’21
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
 */
package deepak;
class A1_StudentInfo{
		
	String name, middleName, surName, birthDate, address;
	int rollNumber;
	
	void setData(){
		name = "Shikha";
		middleName = "Amit";
		surName = "Patel";
		birthDate = "10th Aug 1998";
		address = "G-809, Heaven Apartment, Baner, Pune.";
		rollNumber = 34;
	}
	
	void studentName(){
		System.out.println("First Name of the student is : "+name);
		System.out.println("Middle Name of the student is : "+middleName);
		System.out.println("Surname of the student is : "+surName);
	}
	
	void studentOtherDetails(){
		System.out.println("Birthdate of the student is : "+birthDate);
		System.out.println("Address of the student is : "+address);
		System.out.println("Roll number of the student is : "+rollNumber);
	}
	
	public static void main(String[] args){
		A1_StudentInfo studentInfo = new A1_StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}		
}