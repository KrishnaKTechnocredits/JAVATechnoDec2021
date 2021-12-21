package shivangi;

class Student
{
	String name = "Shivangi";
	int age = 25;
	
	void display(){
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] a){
		System.out.println("Techno");
		Student s1 = new Student();
		s1.display();
		System.out.println("End");
	}
}	