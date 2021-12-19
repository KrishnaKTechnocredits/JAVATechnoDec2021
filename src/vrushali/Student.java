package vrushali;

class Student{
	String name = "Vrushali";
	int age = 25;
	
	void display()
	{
		
		System.out.println(name);
		System.out.println(age);
	}
	void printData()
	{
		System.out.println("printdata");
	}
	
	public static void main(String args[]){
		System.out.println("Techno");
		Student s1 = new Student();
		s1.display();
		s1.printData();
	}

}