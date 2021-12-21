package shital;

class A4{
	
	void weekdays(int index){
		if(index>=1 && index<=5)
			System.out.println("Weekdays");
		else if(index==6 || index==7)
			System.out.println("Weekend");
		else
			System.out.println("Invalid Index");		
	}
	
	public static void main (String[] args){
		A4 assignment4=new A4();
		assignment4.weekdays(4);
	}

}