package sham;
class A1_StudentInfo
{
	String  name, middle_name,surname,DOB,address;// instance varibles
	int roll_no;
	
	void setData()
	{
		name="Sham";
		middle_name="Rao";
		surname="Ugale";
		DOB="13 July 1995";
		address="Yashawant Nagar,Talegaon Dabhade 410506";
		roll_no= 58;
	}
	void studentName()
	{
		System.out.println(name);
		System.out.println(middle_name);
		System.out.println(surname);
		
	}
	void studentOtherInfo()
	{
		System.out.println(DOB);
		System.out.println(address);
		System.out.println("Roll no: "+roll_no);
	}
	public static void main(String args[])
	{
		A1_StudentInfo info= new A1_StudentInfo();
		info.setData();
		info.studentName();
		info.studentOtherInfo();
		
	}
	
}