package yogeshNagar;

class A1_Student
{
	String name = "Yogesh";
	int age = 19;
	
	void display()
	{
		System.out.println(name);
		System.out.println(age);	
	}
	
	public static void main(String[] args){
		A1_Student stInfo = new A1_Student();
		stInfo.display();
	
	}
	
}