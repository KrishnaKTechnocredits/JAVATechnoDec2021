package rohini;
/*Assignment - 13 : 28th Dec'2021
Write a program to satisfy below requirement using indexOf and lastIndexOf method. 
1. Print all duplicate characters from the given string.
2. Print all unique characters from a given string.
3. Return the first unique character from the given string.
4. Return the first duplicate character from the given string. 
 */

public class Rohini_Assignment13 {
	int Dcount =0,Ucount=0;boolean flag;
	char findAllDuplicatechars(String str,char ch){

		if(str.indexOf(ch)==str.lastIndexOf(ch)) {
			Ucount++;
			flag=false;
			return ch;
		}
		else {
			Dcount++;
			flag=true;
			return ch;}


	}

	public void findFirstUnique(String str) {
		int FDcount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
					System.out.println("First Unique Char : "+ch);
				break;

			}

		
		}
		

	}

	public void findFirstDuplicate(String str) {
		int FUcount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(str.indexOf(ch)!=str.lastIndexOf(ch)) {
					System.out.println("First Duplicate Char : "+ch);
				break;

			}

			
		}

	}


	public void getCharFromstr() {
		String str="Rohini";
		for(int i=0;i<str.length();i++) {
			char ch=findAllDuplicatechars("Rohini",str.charAt(i));
			if(flag==true)
				System.out.println("Duplicates:" +ch);
			else 
				System.out.println("Unique:" +ch);

		}


	}




	public static void main(String[] args) {
		Rohini_Assignment13 findduplicate = new Rohini_Assignment13();
		findduplicate.getCharFromstr();
		findduplicate.findFirstDuplicate("Rohini");
		findduplicate.findFirstUnique("Rohini");


	}

}
