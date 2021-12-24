package abhishek;
class Assignment9 {
	int maggie = 50;
	int dosa = 43;
	int oil = 39;
	int panipuri = 43;
	int masala = 73;
	
	void purhaseItem(int reqMaggie, int reqDosa, int reqOil, int reqPanipuri, int reqMasala) {
		if(maggie >= reqMaggie && reqMaggie > 0)
			maggie = maggie - reqMaggie;
		else
			System.out.println("Insufficient stock of maggie");
		if(dosa >= reqDosa && reqDosa > 0)
			dosa = dosa - reqDosa;
		else
			System.out.println("Insufficient stock of daos");
		if(oil >= reqOil && reqOil>0)
			oil= oil - reqOil;
		else
			System.out.println("Insufficient stock of oil");
		if(panipuri>= reqPanipuri && reqPanipuri>0)
			panipuri = panipuri - reqPanipuri;
		else
			System.out.println("Insufficient stock of panipuri");
		if(masala >= reqMasala && reqMasala>0)
			masala = masala - reqMasala;
		else
			System.out.println("Insufficient stock of masala");
	}
	
	void printOutOfStock() {
		boolean flag = true ;
		if(maggie==0)
			System.out.println("Maggie packets are out of stock");
		if(dosa==0)
			System.out.println("Dosa packets are out of stock");
		if(oil==0)
			System.out.println("Oil packets are out of stock");
		if(panipuri==0)
			System.out.println("Panipuri packets are out of stock");
		if(masala==0)
			System.out.println("Masala packets are out of stock");
		if(flag==true)
			System.out.println("All itmes are out of stock");
	}
	void printAvailableStock() {
		if(maggie > 0) 
			System.out.println("Available stock of maggie is: " +maggie);
		if(dosa > 0) 
			System.out.println("Available stock of dosa is: " +dosa);
		if(oil > 0) 
			System.out.println("Available stock of oil is: " +oil);
		if(panipuri > 0) 
			System.out.println("Available stock of panipuri is: " +panipuri);
		if(masala > 0) 
			System.out.println("Available stock of masala is: " +masala);
	}
	
	public static void main(String[] args) {
		Assignment9 assignment9 = new Assignment9();
		assignment9.purhaseItem(50, 25, 20, 70,71);
		assignment9.printAvailableStock();
		assignment9.printOutOfStock();
	}
}
		
		
	
	
		
		