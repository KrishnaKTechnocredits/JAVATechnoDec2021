package krishna;

class A{
	int Num = 100;
	
	void setData(){
		Num = 200;
	}
	
	void displayData(){
		System.out.println("Num is : " + Num);
	}
	
	public static void main(String[] args){
		A a1 = new A();
		a1.setData();
		a1.displayData();
		
		A a2 = new A();
		a2.displayData();
	}
}