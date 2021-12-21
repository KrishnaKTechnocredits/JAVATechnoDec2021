package pranoti;

class A2_WeekDays{
	
	void weekDay(int dayIndex){
		if(dayIndex >=1 && dayIndex <=5)
			System.out.println("WeekDay");
		else if(dayIndex >=6 && dayIndex <=7)
			System.out.println("WeekEnd");
		else
		System.out.println("Invalid Index");
	}
	
	public static void main (String[]args){
		A2_WeekDays weekDays= new A2_WeekDays();
		weekDays.weekDay(3);
		weekDays.weekDay(6);
		weekDays.weekDay(11);
		weekDays.weekDay(-3);
	}
}