package nishika;

import java.util.Scanner;

/* .1.. print freq of each character in given String...input=shivangi  */
	
	public class A_12_1pro {
		
	int  findFrq(String name , char ch) {
			
			int count=0;
			for(int index=0; index<name.length(); index++) {
				char  cha = name.charAt(index);
				
				if(cha == ch) {
					count++;
				}
				
			} return count ;
			
		}
		
		void findAllCharFrq(String name) {
		
			for(int index=0;index<name.length(); index++) {
				char cha = name.charAt(index) ;
				int count= findFrq(name,cha);
				System.out.println(cha+"--->"+count);
			}
			
		}
		
		public static void main(String[] args) {
			A_12_1pro a_12_1pro = new A_12_1pro();
			Scanner s1 = new Scanner(System.in);
			System.out.println("enter name");
			String name=s1.nextLine();
			a_12_1pro.findAllCharFrq(name);
			s1.close();
		}
	}
	