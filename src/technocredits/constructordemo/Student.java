package technocredits.constructordemo;

public class Student {
	int rno;
	String name;
	
	Student(String stdName, int stdRno){
		rno = stdRno;
		name = stdName;
		for(int index=1;index<=5;index++) {
			System.out.println(name);
		}
	}
	
	Student(String stdName){
		name = stdName;
		rno = 1;
	}
	
	Student(){
		name = "Techno";
		rno = 13;
	}
	
	
}
