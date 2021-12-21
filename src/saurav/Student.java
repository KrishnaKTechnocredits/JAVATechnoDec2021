
package saurav;
class Student{
	 
	 String name = "Saurav";
	 int age = 23;
	 
	 void display(){
		 System.out.println(name);
		 System.out.println(age);
	 }
	 void printData(){
		 System.out.println("hello");
	 }
	 public static void main (String[] a){
		 Student s1 = new Student();
		 s1.display();
		 System.out.println("END");
	 }
}