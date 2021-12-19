package apurva;

class FindDays{
	void displayDays(int index){
		if(index>=1 && index<=5){
			System.out.println("DayIndex -> "+index +" : Weekday");
		}
		if(index>=6 && index<=7){
			System.out.println("DayIndex -> "+index +" : Weekend");
		}
		if(index>=8){
			System.out.println("DayIndex -> "+index +" : invalid index");
		}
	}
	
	void displayWeekDays(int index){
		if(index==1){
			System.out.println(index +" -> "+"Monday");
		}
		if(index==2){
			System.out.println(index +" -> "+"Tuesday");
		}
		if(index==3){
			System.out.println(index +" -> "+"Wednesday");
		}
		if(index==4){
			System.out.println(index +" -> "+"Thrusday");
		}
		if(index==5){
			System.out.println(index +" -> "+"Friday");
		}
		if(index==6){
			System.out.println(index +" -> "+"Saturday");
		}
		if(index==7){
			System.out.println(index +" -> "+"Sunday");
		}
		if(index>7){
			System.out.println(index +" -> "+"Invalid day");
		}
	}
	public static void main(String[] a){
		FindDays findDays = new FindDays();
		findDays.displayDays(7);
		findDays.displayDays(3);
		findDays.displayDays(10);
		System.out.println("----------------------------------------");
		findDays.displayWeekDays(1);
		findDays.displayWeekDays(5);
		findDays.displayWeekDays(8);
	}
	
}