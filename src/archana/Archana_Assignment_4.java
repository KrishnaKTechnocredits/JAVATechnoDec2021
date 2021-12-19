package archana;
class Archana_Assignment_4{
	
// Assignment - 4 : 16th Dec2021

	void weekdays(int index){				
	  if(index >= 1 && index <=5 ){		  
		    if(index == 1){
				System.out.println("Index is 1 : Monday");
			}
			if(index == 2){
				System.out.println("Index is 2 : Tuesday");
			}
			if(index == 3){		  
			System.out.println("Index is 3 : Weekdays");
		  }			
	  }else if (index == 6){
		  System.out.println("Index is 6 : WeekEnd");
	  }else if(index == 7){
		  System.out.println("Index is 7 : Sunday");
	  }else{		  		  
			System.out.println("Invalid Index");		  
	  }
	
	}	
	public static void main (String[] args){
		Archana_Assignment_4 days = new Archana_Assignment_4();
		days.weekdays(1);
		days.weekdays(2);
		days.weekdays(7);
		days.weekdays(3);
		days.weekdays(6);
		days.weekdays(11);
		days.weekdays(-3);
	}

}