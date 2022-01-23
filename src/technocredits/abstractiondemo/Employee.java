package technocredits.abstractiondemo;

public class Employee implements Manager{

	@Override
	public void m1() {
		System.out.println(1);
	}

	@Override
	public void m2() {
		System.out.println(2);
	}

	@Override
	public void m3() {
		System.out.println(3);
	}

	@Override
	public String m4(double d, int[] num) {
		System.out.println(4);
		return null;
	}

}
