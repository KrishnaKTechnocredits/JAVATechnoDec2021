package nishika;

/*
    *create a method to return first occurrence of given character from given string.
*
	*create a method to return last occurrence of given character from given string
	*
	*create a method to return true if given character is found from given string else return false.
	*
	*create a method to return total occurrence of given character from given string.
 */

	public class A_11 {
		
		int ocuurance(String name , char ch) {
			int charIndex = -1;
			
			for(int index=0 ; index<name.length(); index++) {
				
				char ab = name.charAt(index);
				if(ab == ch) {
					charIndex=index;
					break;
				}
			}
			return charIndex;
		}
		
		int lastOcuuranceOfIndex(String name , char ch) {
			
			int charIndex=-1;
			for(int index=name.length()-1 ; index>=0 ; index--) {
				
				char ab = name.charAt(index);
				if(ab == ch) {
					charIndex=index;
					break;
				}
			}
			return charIndex;
		}
		
		boolean isBoolean(String name, char ch) {
			
			boolean flag = false;
			for(int index=0 ; index<name.length(); index++) {
				
				char cha=name.charAt(index);
				if(cha == ch) {
					flag=true;
					break;
				}
			}
			
				return flag;
		}
		
		int totalOcuurance(String name , char ch) {
			
			int count=0;
			
			for(int index=0; index<name.length(); index++) {
				char cha=name.charAt(index);
				if(cha == ch) {
					count++;
				}
			}
			return count;
		}
		
		public static void main(String[] args) {
			 A_11 a = new  A_11();
			
			 boolean flag = a.isBoolean("technocredits", 'f');
			 System.out.println(flag);
			 
			 int count=a.totalOcuurance("technocredits",'e');
			 System.out.println(count);
			 
			 int var=a.ocuurance("technocredits", 'c');
			 if(var == -1) {
				 System.out.println("char not found");
			 }else {
				 System.out.println("first occurance of index is-->"+var);
			 }
			 
			 int index= a.lastOcuuranceOfIndex("technocredits", 'c');
			 if(index == -1) {
				System.out.println(" not found");
			 }else {
				 System.out.println("last occurance of index is-->"+index);
			 }
		}
	}
