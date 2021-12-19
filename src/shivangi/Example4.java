package shivangi;

class Example4
{
	int rno;
	String name;
	
	void processData(){
		int num1 = 10;
		rno = num1;
	}
	
	void processAgain(){
		int temp = 100;
		int rno = temp;
	}
	
	void display(){
		System.out.println(rno);
	}
	
	public static void main(String[] args)
	{
		Example4 example4 = new Example4();
		example4.processData();
		example4.processAgain();
		example4.display();
	}
}