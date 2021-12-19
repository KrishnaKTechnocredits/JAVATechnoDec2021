package sagarAcharya;

class Student
{
	String name = "Sagar";
	int age = 25;
	
	void display()
	{
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args)
	{
		Student s1=new Student();
		s1.display();
	}
}