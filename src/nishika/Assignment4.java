class Assignment4{
	
	void weekDays(int dayIndex){
		if(dayIndex>=1 && dayIndex<=5)
			System.out.println("weekDays");
		else if(dayIndex>=6 && dayIndex<=7)
			System.out.println("weekend");
		else
			System.out.println("invalid index");
	}
	
	public static void main(String[] args){
		Assignment4 assignment4 = new Assignment4();
		assignment4.weekDays(3);
		assignment4.weekDays(6);
		assignment4.weekDays(11);
		assignment4.weekDays(-3);
	}
}