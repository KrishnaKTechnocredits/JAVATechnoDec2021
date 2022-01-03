package yogiraj;

public class StudentInfo 
{
	String  Name, middleName, surname, birthDate, Address;
	
	public void setData(String name, String middleName, String  surname, String  birthDate , String address)
	{
		this.Name = name; 
		
		this.middleName = middleName;
		
		this.surname = surname;
		
		this.birthDate = birthDate;
		
		this.Address = address;
	}
	
	public void studentName()
	{
		System.out.println(Name + " " + middleName + " " + surname);
	}
	
	public void studentOtherDetails()
	{
		System.out.println(birthDate + "\n" + Address);
	}
	public static void main(String[] args)
	{
		StudentInfo s = new StudentInfo();
		
		s.setData("yogiraj", "Dattatray", "Kulkarni", "26 July", "Sahakar Nagar");
		
		s.studentName();
		
		s.studentOtherDetails();
	}

}
