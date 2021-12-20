package nishika;

class A4_assignment4{
	
	void weekDays(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
			System.out.println("weekDays");
		else if(dayIndex>=6 && dayIndex<=7)
			System.out.println("weekend");
		else
			System.out.println("invalid index");
	}
	
	public static void main(String[] args){
		A4_assignment4 a4_assignment4 = new A4_assignment4();
		a4_assignment4.weekDays(3);
		a4_assignment4.weekDays(6);
		a4_assignment4.weekDays(11);
		a4_assignment4.weekDays(-3);
	}
}