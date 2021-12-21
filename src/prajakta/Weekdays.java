package prajakta;

class Weekdays{

    void checkday(int dayIndex){
		if(dayIndex >= 1 && dayIndex <=5)
			System.out.println("Weekday");
		else if(dayIndex >= 6 && dayIndex <=7)
			System.out.println("Weekend");
		else
			System.out.println("invalid index");
	}

	public static void main(String[] args){
		Weekdays weekdays = new Weekdays();
		weekdays.checkday(3);
		weekdays.checkday(6);
		weekdays.checkday(11);
		weekdays.checkday(-3);
	}	
} 