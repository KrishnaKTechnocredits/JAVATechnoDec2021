package priya;

public class A11_StringCh {
        /*Assignment - 11 : 24rd Dec'2021
		Write a program with following methods.
		1. create a method to return first occurrence of given character from given string.
		2. create a method to return last occurrence of given character from given string.
		3. create a method to return true if given character is found from given string else return false.
		4. create a method to return total occurrence of given character from given string.*/
			int getFirstOccurence(String name, char ch) {
				int index=0;
				for(;index<name.length();index++) {
					if(name.charAt(index)==ch) {
						return index;
					}
				}
				return index;		
			}
			
			int getLastOccurence(String name,char ch) {
				int charindex=0;
				for(int index=0;index<name.length();index++) {
					if(name.charAt(index)==ch) {
						charindex=index;
					}
				}
				return charindex;
			}
			
			boolean isCharacterPresent(String name,char ch) {
				boolean flag=false;
				for(int index=0;index<name.length();index++) {
					if(name.charAt(index)==ch) {
						flag=true;
					}
				}
				return flag;
			}
			
			int getCharcterRepetationCount(String name,char ch) {
				int count = 0;
				for(int index=0;index<name.length();index++) {
					if(name.charAt(index)==ch) {
						count++;
					}
				}
				return count;	
			}
			
			public static void main(String[] args) {
				A11_StringCh charLogic = new A11_StringCh();
				int charcterPosition = charLogic.getFirstOccurence("technocredits", 'e');
				System.out.println("First Occurence of character in given string is "+ charcterPosition);
				
				int lastCharcterOcurrence = charLogic.getLastOccurence("technocredits", 'e');
				System.out.println("Last Occurence of character in given string is "+ lastCharcterOcurrence);
				
				boolean charPresentFlag = charLogic.isCharacterPresent("technocredits", 'a');
				if(charPresentFlag==true)
					System.out.println("Character is Present in given string");
				else
					System.out.println("Charcter is not present in given string");
				
				int characterRepetation = charLogic.getCharcterRepetationCount("technocredits", 'e');
				System.out.println( "charcater repetation count is "+ characterRepetation);
			}
			
		}

