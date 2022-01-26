package technocredits.blocksdemo;

public class Child extends Parent{
	boolean flag = true;
	{
		flag = false;
		System.out.println(2);
	}
	
	{
		if(flag == true)
			System.out.println(4);
	}
	
	Child(String name){
		super();
		System.out.println(name);
	}

	
	public static void main(String[] args) {
		Child c1 = new Child("swati");
	}
	
	
	
	
}
