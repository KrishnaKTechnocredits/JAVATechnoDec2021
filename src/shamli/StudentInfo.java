package shamli;

class StudentInfo
{
	String name,middlename,sirname,birthdate,address;
	int rollnumber;
	
	void setData()
	{
		name = "Shamli";
		middlename = "Sanjay";
		sirname = "Gadekar";
		birthdate = "22nd April 1996";
		address = "A/P : Amrapur Tal: Junnar,Dist:Pune,410502";
		rollnumber = 22;
	}
	
	void studentName()
	{
		System.out.print("Student Name is : " + name);
		System.out.print(" " + middlename);
		System.out.println(" " + sirname);
	}
	
	void studentOtherDetails()
	{
		System.out.println("Student's Birthdate is : " +(birthdate));
		System.out.println("Student Address is : " + (address));
		System.out.println("Student's Roll Number is : " + (rollnumber));
	}
	
	public static void main(String[] args)
	{
		StudentInfo studentinfo = new StudentInfo();
		studentinfo.setData();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
	}
}