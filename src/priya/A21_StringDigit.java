package priya;

public class A21_StringDigit {
	
	void printDigit() {
			String input = "T2ec45h6n9o";
			String temp = "";
			for(int index=0; index<input.length(); index++) {
				if(Character.isDigit(input.charAt(index))) {
					temp = temp + input.charAt(index);
				}
			}
			System.out.println("String " +input+ " contains digits: "+temp+" ");
		}

		public static void main(String[] args) {
			new A21_StringDigit().printDigit();
		}
	}

