package yogeshNagar;

class A6_WeekDays{
	
	void getDay(int dayIndex){
		if(dayIndex > 0 && dayIndex <= 5)
			System.out.println("It's WeekDay & DayIndex is " +dayIndex);
		else if(dayIndex > 5 && dayIndex <= 7)
			System.out.println("It's WeekEnd & DayIndex is " +dayIndex);
		else
			System.out.println("Please provide valid input between 1 to 7 & DayIndex is " +dayIndex);
	}
	
	public static void main(String[] args){
		A6_WeekDays weekDays = new A6_WeekDays();
		weekDays.getDay(3);
		weekDays.getDay(6);
		weekDays.getDay(11);
		weekDays.getDay(-3);
	}
}