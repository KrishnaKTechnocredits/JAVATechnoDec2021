package technocredits.overridingdemo;

public class Parent {
	
	void m1() {
		System.out.println("HI");
	}
	
	//Parent temp = new Child()
	Parent m2() {
		return new Parent();
	}
	
	
}
