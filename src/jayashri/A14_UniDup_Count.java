package jayashri;

public class A14_UniDup_Count {

	int uniquecount;
	int duplicatecount;
		
		void allDuplicate(String str){
			for(int index = 0;index<str.length();index++){
				char ch = str.charAt(index);
			if(index == str.indexOf(ch)) {
				if(str.indexOf(ch)!= str.lastIndexOf(ch)) {
					duplicatecount++;				
				}
			}
			}
			System.out.println("duplicate character count sum is :" +duplicatecount);
		}
		
		void allUnique(String str){		
			for(int index = 0;index<str.length();index++){
				char ch = str.charAt(index);
			if(index == str.indexOf(ch)) {
				if(str.indexOf(ch)== str.lastIndexOf(ch)) {
					uniquecount++;				
				}
			}
			}
			System.out.println("unique character count sum is :" +uniquecount);
		}
		
		void compare() {
			if(duplicatecount > uniquecount){
				System.out.println("Java");
			}
			else {
				System.out.println("Selenium");
			}
		}
		
		public static void main(String [] args){
			A14_UniDup_Count a14_unidup_Count = new A14_UniDup_Count();
			a14_unidup_Count.allUnique("technocredits");
			a14_unidup_Count.allDuplicate("technocredits");
			a14_unidup_Count.compare();
		}
}
