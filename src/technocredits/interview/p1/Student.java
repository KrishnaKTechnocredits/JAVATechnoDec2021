package technocredits.interview.p1;

public class Student {
	
	String name;
	int rno;
	
	Student(int rno, String name){
		this.rno = rno;
		this.name = name;
	}
	
	public String toString() {
		return rno + "-" + name;
	}
	
	@Override
	public int hashCode() {
		return rno;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student)obj;
		return (this.rno == student.rno && this.name.equals(student.name));
	}
}
