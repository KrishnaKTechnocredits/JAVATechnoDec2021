package technocredits.overridingdemo;

public class Child extends Parent{

	@Override
	void m1() {
		System.out.println("Hi");
		System.out.println("THis is Ashok");
		System.out.println("This is Ashutosh");
		System.out.println("Thank you, thats it");
	}
	
	@Override
	Child m2() {
		return new Child();
	}

}
