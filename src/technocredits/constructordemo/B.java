package technocredits.constructordemo;

public class B extends A{

	B(){
		System.out.println("3");
	}
	
	B(String str){
		System.out.println("4");
	}
	
	void m1() {
		System.out.println("6");
	}
}
