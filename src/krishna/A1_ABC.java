package krishna;

class A1_ABC{
	int Num = 100;
	
	void setData(){
		Num = 200;
	}
	
	void displayData(){
		System.out.println("Num is : " + Num);
	}
	
	public static void main(String[] args){
		A1_ABC a1 = new A1_ABC();
		a1.setData();
		a1.displayData();
		
		A1_ABC a2 = new A1_ABC();
		a2.displayData();
	}
}