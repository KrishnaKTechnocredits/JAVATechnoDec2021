package vaishnavi;

class Weekdays{
	
	void display(int dayIndex){
		if (dayIndex >= 1 && dayIndex <=5){
			System.out.println("This is a weekday and this is day "+dayIndex);
		}else if (dayIndex >= 5 && dayIndex <=7){
			System.out.println("This is a weekend and this is day "+dayIndex);
		}else
			System.out.println("This is Invalid Index "+dayIndex);
	}
	
	public static void main(String[] args){
		Weekdays weekdays =new Weekdays();
		weekdays.display(3);
		weekdays.display(6);
		weekdays.display(11);
		weekdays.display(-3);
	}
	
}
