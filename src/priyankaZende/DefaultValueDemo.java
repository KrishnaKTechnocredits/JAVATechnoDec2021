package priyankaZende;
class DefaultValueDemo{
	String s;
	char c;
	byte by;
	short sh;
	int i;
	long l;
	float f;
	double d;
	boolean b;

	void printDefaulValueForInstanceVariable(){
		System.out.println("String : " + s);
		System.out.println("Char : " + c + "Size is :" +  Character.BYTES + ".");
		System.out.println("Byte : " + by);
		System.out.println("Short : " + sh);
		System.out.println("Int : " + i);
		System.out.println("long : " + l);
		System.out.println("float : " + f);
		System.out.println("double : " + d);
		System.out.println("boolean : " + b);
	}
	/*
	void printDefaulValueForLocalVariable(){
		String s;
		char c;
		byte by;
		short sh;
		int i;
		long l;
		float f;
		double d;
		boolean b;
		System.out.println("String : " + s); //DefaultValue.java:34: error: variable s might not have been initialized
											//System.out.println("String : " + s);
		System.out.println("Char : " + c);
		System.out.println("Byte : " + by);
		System.out.println("Short : " + sh);
		System.out.println("Int : " + i);
		System.out.println("long : " + l);
		System.out.println("float : " + f);
		System.out.println("double : " + d);
		System.out.println("boolean : " + b);
	}
	*/
	public static void main(String[] args){
		DefaultValueDemo defaultValue = new DefaultValueDemo();
		defaultValue.printDefaulValueForInstanceVariable();
		//defaultValue.printDefaulValueForLocalVariable();
	}	
}	
		
/*
String : null
Char :
Byte : 0
Short : 0
Int : 0
long : 0
float : 0.0
double : 0.0
boolean : false
*/