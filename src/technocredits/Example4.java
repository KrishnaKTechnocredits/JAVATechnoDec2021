package technocredits;

class Example4{
	
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
		Example4 example4_1 = new Example4();
		example4_1.updateName();
		
		Example4 example4_2 = new Example4();
		example4_2.updateName();
		
		Example4 example4_3 = new Example4();
		example4_3.display();
		example4_3.updateName();
	}
}