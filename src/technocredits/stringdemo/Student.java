package technocredits.stringdemo;

public class Student {

	int rno;
	String name;
	
	Student(int rno, String name){
		this.rno = rno;
		this.name = name;
	}
	
	public String toString() {
		return name + " - " + rno;
	}
}
