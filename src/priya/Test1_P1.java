package priya;
	
	/*Program 1 : find the first non repeating character from given string. 
	   input : technocredits
	   output : h  
	   */

	public class Test1_P1{

		int RepeatCount(String name,char ch) {
			int count=0;
			for(int index=0; index<name.length(); index++) {
				if(name.charAt(index)==ch) {
					count++;
				}
			}
			return count;
		}

		void input(String name) {
			for(int index=0;index<name.length();index++) {
				int count = RepeatCount(name,name.charAt(index));
				if(count==1) {
					System.out.println("First non repeating charcater is "+ name.charAt(index));
					break;
				}			
			}		
		}
		
		public static void main(String[] args) {
			 Test1_P1 nonRepeating = new Test1_P1();
			nonRepeating.input("technocredits");
			
		}

	}

