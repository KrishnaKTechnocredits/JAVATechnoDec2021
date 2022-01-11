package anjali;

public class Anjali_Assignment19 {
	
	static void checkDigitorLetterInString(String name){
		int digitcnt=0;
		int uppercasecnt=0;
		int lowercasecnt=0;
		for(int index=0;index<name.length();index++){
			if(Character.isDigit(name.charAt(index)))
				digitcnt++;
			else if(Character.isLetter(name.charAt(index)))
				if(Character.isUpperCase(name.charAt(index)))
					uppercasecnt++;
				else 
					lowercasecnt++;
	    }System.out.println("The total digits in "+name+" are :"+digitcnt);
		System.out.println("The total  letters in "+name+"are :"+(uppercasecnt+lowercasecnt));
		System.out.println("The total uppercase letters in "+name+" are :"+uppercasecnt);
		System.out.println("The total lower case letters in "+name+" are :"+lowercasecnt);
	}

	public static void main(String[] args) {
		checkDigitorLetterInString("Technoc6859red689its");
	}
}
