class StudentInfo{
	String name,middleName,sirname,birthdate,address;
	int rNumber;
	
	void setData(){
		 name= "Peter";
		 middleName = "Tom";
		 sirname = "Mathew";
		 birthdate = "30/12/1995";
		 address = "G-102,Heaven Apartment,Baner,Pune.";
		 rNumber = 10135;
	}
	
	void studentName(){
		System.out.println(name);
		System.out.println(middleName);
		System.out.println(sirname);
	}
	
	void studentOtherDetails(){
		System.out.println(birthdate);
		System.out.println(address);	
	}
	
	public static void main (String[] args)
	{
		StudentInfo s1= new StudentInfo();
		s1.setData();
		s1.studentName();
		s1.studentOtherDetails();
	}
	
}