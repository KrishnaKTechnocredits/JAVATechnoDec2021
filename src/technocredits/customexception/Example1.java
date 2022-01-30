package technocredits.customexception;

public class Example1 {

	void ageValidator(int age) throws AgeNotValidException{
		if(age >=18)
			System.out.println("Welcome - Your age is " + age);
		else
			throw new AgeNotValidException("Valid age is 18, user age is " + age);
	}
	
	public static void main(String[] args) throws AgeNotValidException {
		try {
			Example1 example1 = new Example1();
			example1.ageValidator(17);
		}catch(AgeNotValidException ae) {
			System.out.println(ae.getMessage());
		}finally {
		
		}
	}
	
	
}
