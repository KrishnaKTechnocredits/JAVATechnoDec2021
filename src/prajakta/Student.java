package prajakta;

class Student 
{ 
    String name = " Prajakta"; 
	int age = 23; 
	
	void display(){ 
	    System.out.println(name); 
	    System.out.println(age);
	}
	
    public static void main(String[] a){ 
	Student s1 = new Student(); 
	s1.display();
	}
}	
