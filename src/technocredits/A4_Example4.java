package technocredits;

class A4_Example4{
	
	String name = "Vrushali";
	String password = "sagar123";
	
	void updateName(){
		name = "Vrush";
	}
	
	void display(){
		System.out.println(name);
		System.out.println(password);
	}
	
	public static void main(String[] args){
		A4_Example4 example4_1 = new A4_Example4();
		example4_1.updateName();
		
		A4_Example4 example4_2 = new A4_Example4();
		example4_2.updateName();
		
		A4_Example4 example4_3 = new A4_Example4();
		example4_3.display();
		example4_3.updateName();
	}
}