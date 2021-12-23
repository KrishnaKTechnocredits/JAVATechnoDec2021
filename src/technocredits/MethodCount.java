package technocredits;

public class MethodCount {
	int count;
	static int totalCount;
	
	void processData() {
		count++;
		totalCount++;
	}
	
	void display() {
		System.out.println(   count);
	}
	
	static void totalCountDisplay() {
		System.out.println(totalCount);
	}
	
	public static void main(String[] args) {
		MethodCount methodCount1 = new MethodCount();
		methodCount1.processData();
		methodCount1.processData();
		
		MethodCount methodCount2 = new MethodCount();
		methodCount2.processData();
		methodCount2.processData();
		methodCount2.processData();
		
		methodCount1.display();
		methodCount2.display();
		MethodCount.totalCountDisplay();
		MethodCount.totalCountDisplay();
	}
}
