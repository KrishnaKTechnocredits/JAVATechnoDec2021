package technocredits.constructordemo;

public class Child1 extends Parent1{

	void m1() {
		Parent1 p = new Parent1();
		System.out.println(p.x);
		
		System.out.println(super.x);
		System.out.println(this.x);
		System.out.println(x);
	}
	
}
