package technocredits;

public class PostIncrementEx1 {

	static void processData() {
		int count = 1;
		while(++count<5){
			System.out.println(count);//2 3 4 5
		}   
		System.out.println("------------" + count);
	}
	
	public static void main(String[] args) {
		PostIncrementEx1.processData();
	}
}
