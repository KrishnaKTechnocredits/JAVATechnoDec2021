package jagdish;
class A0_Student
{
  String name = "Jagdish";
  int age = 25;
  
	void display()
	{
	  System.out.println(name);
	  System.out.println(age);  
	}
	
	void printdata()
	{
		System.out.println("This is print data ");
	}

	public static void main(String[] args)
	{
	  System.out.println("Techno");
	  A0_Student s1 = new A0_Student();
	  s1.display();
	  s1.printdata();
	}
}	