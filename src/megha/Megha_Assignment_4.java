package megha;


class DaysOfWeek{
	
	void dayDetermination(int dayIndex){
		if(dayIndex >= 1 && dayIndex <= 5)
			System.out.println("It is a Weekday : " + "Day " + dayIndex);
		else if(dayIndex > 5 && dayIndex <= 7)
			System.out.println("It is a Weekend : " + "Day " + dayIndex);
		else
			System.out.println("Invalid Index : " + "Day " + dayIndex);
	}
	
	public static void main(String[] args){
		DaysOfWeek daysOfWeek = new DaysOfWeek();
		daysOfWeek.dayDetermination(3);
		daysOfWeek.dayDetermination(6);
		daysOfWeek.dayDetermination(11);
		daysOfWeek.dayDetermination(-3);
	}
}