package technocredits.interview.p1;

public class Manager {

	String name;
	
	public boolean equals(Object obj) {
		Manager mng = (Manager)obj;
		System.out.println(mng.name); // Pallavi
		
		System.out.println(this.name); // Vaibhav
		
		return this.name.equals(mng.name);
	}
	
	public static void main(String[] args) {
		Manager mng1 = new Manager();
		mng1.name = "Vaibhav";
		
		Manager mng2 = new Manager();
		mng2.name = "Vaibhav";
		
		boolean flag = mng1.equals(mng2);
		System.out.println(flag);
		
	}
}
