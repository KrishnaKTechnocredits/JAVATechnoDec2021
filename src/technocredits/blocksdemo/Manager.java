package technocredits.blocksdemo;

public class Manager {

	static {
		System.out.println(1);
	}
	
	{
		System.out.println(2);
	}
	
	Manager(){
		System.out.println(3);
	}
}
