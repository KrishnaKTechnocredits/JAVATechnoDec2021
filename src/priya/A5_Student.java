class Student {
	String start = "Start";
	String name = "Hello Priya";
	int age = 25;
	
	void display(){
		System.out.println(name);
		System.out.println(age);
	} 
	
	public static void main (String[] args){
		Student s = new Student();
		System.out.println(start);
		s.display();
		System.out.println("end");	
	}
}