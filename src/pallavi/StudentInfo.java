/*Assignment-1 13-Dec_21 */

package pallavi;

class StudentInfo{
	String name,middleName,surname,bithrdate,address;
	int rollNumber;
	
	void setData(){
		name="Arjun";
		middleName="Amit";
		surname="Naikare";
		bithrdate="3rd July 2010";
		address="4A,Vrundavan,Pashan,Pune.";
		rollNumber=25;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(surname);
	}
	
	void studentOtherDetails(){
		System.out.println(bithrdate);
		System.out.println(address);
		System.out.println(rollNumber);
	}
	
	public static void main(String[] arr){
		StudentInfo studentInfo= new StudentInfo();
		studentInfo.setData();
		studentInfo.studentName();
		studentInfo.studentOtherDetails();
	}
}