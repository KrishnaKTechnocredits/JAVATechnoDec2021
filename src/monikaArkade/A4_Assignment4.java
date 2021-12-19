package monikaArkade;

class A4_Assignment4{
	
	void processData(int dayIndex){
		if(dayIndex > 0 && dayIndex <=5)
			System.out.println("Day Index :"+ dayIndex+": Weekday");
		else if(dayIndex > 5 && dayIndex <= 7)
			System.out.println("Day Index :"+ dayIndex+": WeekEnd");
		else
			System.out.println("Day Index :"+ dayIndex+": Invalid Index");
	}
	
	public static void main(String[] args){
		A4_Assignment4 assignment4 = new A4_Assignment4();
		assignment4.processData(3);
		assignment4.processData(6);
		assignment4.processData(11);
		assignment4.processData(-3);
	}
}














