package monikaBhurey;
class Student
{
	String name = "Monika";
	int age = 29;
	
	void display(){
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args)
		{
			Student s1 = new Student();
			s1.display();
			System.out.println("End");
		}
}