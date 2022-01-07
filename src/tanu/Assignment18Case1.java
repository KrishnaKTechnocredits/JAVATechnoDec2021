package tanu;

class Father {
	String colour = "white";
	private int salary = 10000;
	
	void address() {
		System.out.println("Ratlam");
	}
	
	void occupation1() {
		System.out.println("Family Business");
	}
}

class Child extends Father {
	String weight = "30 kg";
	
	void address() {
		System.out.println("Indore");
	}
	
	void occupation2() {
		System.out.println("Singer");
	}
}

class Assignment18Case1 {
	
	public static void main(String[] arg) {
    Father ravi = new Father();
    //System.out.println(ravi.weight); //Parent Class cannot inherit properties from Child Class 
	}
	
}

