package priyankaZende;

class LocalInstanceVarDemo {
	int rno;
	String name;

	void processData() {
		int num1 = 10;
		rno = num1;
		System.out.println(rno);
	}

	void processAgain() {
		int temp = 100;
		int rno = temp;
		System.out.println(rno);
	}

	void display() {
		System.out.println(rno);
	}

	public static void main(String[] args) {
		LocalInstanceVarDemo example5 = new LocalInstanceVarDemo();
		example5.processData();
		example5.processAgain();
		example5.display();
	}
}
// 10