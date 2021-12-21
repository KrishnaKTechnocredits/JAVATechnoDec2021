package poojaRajguru;

class Student{
	
	String name = "pooja";
	int age = 27;
 
		void display(){
			System.out.println(name);
			System.out.println(age);
		}	
		
		void printData(){
			
			System.out.println("Hello");
		}
 
		public static void main(String[] args){
			
			Student s1 = new Student();
			
			s1.display();
			s1.printData();
			s1.display();
			System.out.println("End");
					
		}
}