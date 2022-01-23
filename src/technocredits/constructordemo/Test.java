package technocredits.constructordemo;

public class Test {
	
	Test(){
		System.out.println("Techno"); //3
	}
	
	Test(String name){
		System.out.println(name + ":" + name.length());
	}
	
	void display() {
		System.out.println("Credits");
	}
	
	void display(String name) {
		System.out.println("Credits");
	}
	
	public static void main(String[] args) {
		System.out.println("GM"); // 1
		Test test = new Test("Technocredits"); // 2 //4
		test.display(); //5
		System.out.println("End"); // 6
	}
}
