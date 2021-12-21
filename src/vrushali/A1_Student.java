package vrushali;

class A1_Student{
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
		A1_Student s1 = new A1_Student();
		s1.display();
		s1.printData();
	}

}