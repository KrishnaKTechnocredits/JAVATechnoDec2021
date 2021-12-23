package priyankaZende;

public class StaticNonStaticVarDemo {
	static int count;
	int index;

	void increament() {
		count++;
		index++;
	}

	public static void main(String[] args) {
		StaticNonStaticVarDemo staticNonStaticVarDemo1 = new StaticNonStaticVarDemo();
		staticNonStaticVarDemo1.increament();

		StaticNonStaticVarDemo staticNonStaticVarDemo2 = new StaticNonStaticVarDemo();
		staticNonStaticVarDemo2.increament();

		System.out.println(StaticNonStaticVarDemo.count);
		System.out.println(staticNonStaticVarDemo1.count);
		System.out.println(staticNonStaticVarDemo2.count);

		// System.out.println(StaticNonStaticVarDemo.index);
		System.out.println(staticNonStaticVarDemo1.index);
		System.out.println(staticNonStaticVarDemo2.index);

	}

}
