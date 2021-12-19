package karan;

public class Assignment_1 {
	/* Assignment -1 : 13th Dec’21

	Program Statement : Print all details of Student like Name, Middle name, Surname, birthdate, Address, and Roll number.

	1. Create class called StudentInfo
	2. Define 5 variables : Name, middle name, surname, birthdate(eg: 10th Aug 1998), Address as String and rollNumber as int.
	3. Create method called setData to set value of instance variable. Create another two methods called studentName() and studentOtherDetails()
	4. studentName() method should print details like Name, middle name, surname.
	5. studentOtherDetails() method print details like birthdate, Address, and Roll number.
	6. Create main method.
	7. write a logic in main method.
		a. Create object of StudentInfo class.
		b. call studentName() and studentOtherDetails() method on reference variable
	8. Compile & Run  */

		String name ="Karan",middleName = "Kumar",surName ="Das",birthDate = "15th August 1995",address = "Pune";
		int rollNumber = 420;
		
		void studentName(){
			System.out.println("Student First Name: "+ name);
			System.out.println("Student Middle Name: "+ middleName);
			System.out.println("Student Last Name: "+ surName);
		}
		
		void studentOtherDetails(){
			System.out.println("Student Date of birth: "+ birthDate);
			System.out.println("Student Address: "+ address);
			System.out.println("Student roll number: "+ rollNumber);
		}
		
		public static void main(String[] args){
			Assignment_1 studentInfo = new Assignment_1();
			studentInfo.studentName();
			studentInfo.studentOtherDetails();
		}
}
