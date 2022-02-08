package technocredits.collectionDemo;

import java.util.ArrayList;

public class Example5 {

	void m1() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		System.out.println(al); // [10, 20, 30]
		
		int temp = al.set(1, 200); // replace
		
		if(temp != 20)
			al.set(1, temp);
		
		System.out.println(al); // [10, 200, 30]
	}
	
	public static void main(String[] args) {
		new Example5().m1();
	}
	
}
