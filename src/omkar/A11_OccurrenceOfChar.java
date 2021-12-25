package omkar;

public class A11_OccurrenceOfChar {
	
	int firstOccurrence(String name, char ch) {
		int i;
		for ( i = 0; i<name.length(); i++) {
			if(name.charAt(i)== ch) {
				
				System.out.println(" The first occurnace is " +ch+ " character of string "+name+ " is " +i);
				
				break; 
			}
		}
		return i;
		
	}
	
	int lastOccurrence(String name , char ch) {
		int i;
		for( i =name.length()-1;i >=0 ; i--) {
			if(name.charAt(i) == ch) {
				System.out.println(" The last occurnace is " +ch+ " character of string "+name+ " is " +i);
				
				break;
			}
		}
		return i ;
		
	}
	
	boolean charFound(String name , char ch) {
		int i;
		boolean flag=false;
		for(i=0; i<name.length();i++) {
			
			if(name.charAt(i)==ch)
				System.out.println();
				flag= true;
		}
		return flag;
	}
	
	int totalOccurrence(String name ,char ch) {
		int i;
		int count=0;
		for(i=0; i<name.length();i++) {
			if(name.charAt(i)==ch)
				count++;
		}
		return count ;		
	}

	public static void main(String[] args) {
		A11_OccurrenceOfChar a11_OccurrenceOfChar = new A11_OccurrenceOfChar();
		a11_OccurrenceOfChar.firstOccurrence("Technocredit" , 'e');
		a11_OccurrenceOfChar.lastOccurrence("Technocredit",'e');
		a11_OccurrenceOfChar.charFound("Technocredit", 'e');
		boolean b= a11_OccurrenceOfChar.charFound("Technocredit", 'e');
		System.out.println(b);
		int sum = a11_OccurrenceOfChar.totalOccurrence("Technocredit", 'e');
		System.out.println("The total occurnace of given char is :"+sum);
		
	}

}
