package ranjeet;
class Days{
	
	void printDays(int i){
		if(i == 1){
			System.out.println("Weekdays Monday");
		}if(i == 2){
			System.out.println("Weekdays Tuesday");
		}if(i == 3){
			System.out.println("Weekdays Wednesday");
		}if(i == 4){
			System.out.println("Weekdays Thursday");
		}if(i == 5){
			System.out.println("Weekdays Friday");
		}if(i == 6){
			System.out.println("WeekEnd Saturday");
		}if(i == 7){
			System.out.println("WeekEnd Sunday");
		}if(i > 7){
			System.out.println("Invalid Index");
		}if(i<0){
			System.out.println("Invalid Index");
		}
	}
	public static void main(String[] args){
			Days days = new Days();
			days.printDays(6);
		}
}