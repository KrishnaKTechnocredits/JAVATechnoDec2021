package shital;

class A1{

	String name= "Shital";
	int age = 25;
	
	void student(){
		System.out.println("Student name is: "+name);
		System.out.println("Student age is :"+age);
	}
	
	public static void main(String[] args){
		A1 assignment1=new A1();
		assignment1.student();
	}
}