package technocredits.constructordemo;

public class Parent {

	Parent(){
		System.out.println("Parent default constructor");
	}
	
	Parent(int num){
		//super();
		System.out.println(num);
	}
	
	void m1() {
		System.out.println("Parent m1");
	}
}
