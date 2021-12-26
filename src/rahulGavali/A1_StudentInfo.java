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

package rahulGavali;

public class A1_StudentInfo {
		String firstname, middlename, surname, address, birthdate;
		int rollno;
		
		void setData(){
			firstname = "Rahul";
			middlename = "Sadashiv";
			surname = "Gavali";
			address = "Wakad";
			birthdate = "28th June'21";
			rollno = 01;
		}
		void displayInfo(){
			System.out.println("Student first name is " + firstname);
			System.out.println("Student middle name is " + middlename);
			System.out.println("Student surname is " + surname);
		}
		void displayOtherInfo(){
			System.out.println("Student birthdate is " + birthdate);
			System.out.println("Student address is " + address);
			System.out.println("Student rollno is " + rollno);
			
		}	
		public static void main (String[] arg){
			A1_StudentInfo studentInfo = new A1_StudentInfo();
			studentInfo.setData();
			studentInfo.displayInfo();
			studentInfo.displayOtherInfo();
		}
		
}

