package technocredits;

class A5_E{
	
	int rno;
	String name;
	
	void processData(){
		int num1 = 10;
		rno = num1;
	}
	
	void processAgain(){
		int temp = 100;
		int rno = temp;
		System.out.println(rno);
	}
	
	void display(){
		System.out.println(rno); 
	}
	
	public static void main(String[] args){
		A5_E example5 = new A5_E();
		example5.processData();
		example5.processAgain();
		example5.display();
	}
}