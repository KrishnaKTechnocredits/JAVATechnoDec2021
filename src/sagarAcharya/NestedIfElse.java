package sagarAcharya;

class NestedIfElse{

	void displayGrade(int score){
			if(score>=40){
				if(score>40 && score<=60)
					System.out.println("D");
				else if(score>60 && score<=70)
					System.out.println("C");
				else if(score>70 && score<=80)
					System.out.println("B");
				else if(score>80 && score<=95)
					System.out.println("A");
				else if(score>95 && score<=100)
					System.out.println("Distinction");
				else if(score<40 && score>=0)
					System.out.println("Work Harder");
			}
			else
				System.out.println("Invalid score");
	
	}
	
	public static void main(String[] args){
	NestedIfElse nestedIfElse = new NestedIfElse();
	nestedIfElse.displayGrade(60);
	}
}		
