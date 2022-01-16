package technocredits.constructordemo;

public class Parent1 {
	int x = 10;
	
	int[] x1 = new int[] {10,20};
	int[] x2 = {10,20};
	int[] x3 = new int[2];
	
	void m2() {
		x3[0] = 10;
		x3[1] = 20;
		x3 = x2;
	}

}
