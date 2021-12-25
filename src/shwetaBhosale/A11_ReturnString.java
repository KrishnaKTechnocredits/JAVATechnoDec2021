public class A11_ReturnString {	
	// find first occurrence

	int firstOccur(String name, char c) {
		int index=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==c) {
				index=i;
				break;
			}
		}

		return index;
	}

	//find last occurence of given character

	int lastOccur(String name,char c) {
		int index=0;
		for(int i=name.length()-1;i>1;i--) {
			if(name.charAt(i)==c) {
				index=i;
				break;
			}
		}
		return index;
	}

	// Charcter found in given String

	boolean findChar(String name,char c) {
		boolean flag=false;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==c) {
				flag=true;
			}
		}
		return flag;
	}

	//Total character from given String

	int totalChar(String name, char c) {
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==c) {
				count++;
			}
		}
		return count;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A11_ReturnString occur=new A11_ReturnString();
		int firstIndex=occur.firstOccur("Apple", 'p');
		System.out.println("First Occurence of char is at index " +firstIndex);

		int lastIndex=occur.lastOccur("apple", 'l');
		System.out.println("Last Occurence of char is at index " +lastIndex);

		boolean result=occur.findChar("apple", 's');
		System.out.println("Charcter Found " +result);

		int total=occur.totalChar("mississipi", 's');
		System.out.println(total);
	}

}