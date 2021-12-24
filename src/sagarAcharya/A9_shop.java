package sagarAcharya;

public class A9_shop{
	
	int maggie = 50;
	int dosa = 43;
	int pouches = 39;
	int paniPuri = 43;
	int masala = 73;
	
	void purchaseItem(int maggieQ,int dosaQ,int pouchesQ,int paniPuriQ,int masalaQ){
		
		if(maggieQ <= maggie)
			maggie = maggie - maggieQ;
		else
			System.out.println("Insufficient quantity , requested maggie is " + maggieQ + " and available is " + maggie);
			
		if(dosaQ <= dosa)
			dosa = dosa - dosaQ;
		else
			System.out.println("Insufficient quantity , requested dosa is " + dosaQ + " and available is " + dosa);
			
		if(pouchesQ <= pouches)
			pouches = pouches - pouchesQ;
		else
			System.out.println("Insufficient quantity , requested pouches are " + pouchesQ + " and available is " + pouches);
			
		if(paniPuriQ <= paniPuri)
			paniPuri = paniPuri - paniPuriQ;
		else
			System.out.println("Insufficient quantity , requested Panipuri is " + paniPuriQ + " and available is " + paniPuri);
			
		if(masalaQ <= masala)
			masala = masala - masalaQ;
		else
			System.out.println("Insufficient quantity , requested masala is " + masalaQ + " and available is " + masala);
	}
	
	void outOfStock(){
	
		boolean availableFlagQ = true;
		if(maggie == 0){
			System.out.println("Maggie is Out of stock.");
			availableFlagQ = false;
		}
		if(dosa == 0){
			System.out.println("Dosa is Out of stock.");
			availableFlagQ = false;
		}
		if(pouches == 0){
			System.out.println("Pouches is Out of stock.");
			availableFlagQ = false;
		}
		if(paniPuri == 0){
			System.out.println("Panipuri is Out of stock.");
			availableFlagQ = false;
		}
		if(masala == 0){
			System.out.println("Masala is Out of stock.");
			availableFlagQ = false;
		}
			
		if(availableFlagQ == true)
			System.out.println("None of the items are out of stock");
	}
	
	void availableItems(){
	
		boolean availableFlagQ = true;
		if(maggie > 0){
			System.out.println("Quantity of Maggie is : " + maggie);
			availableFlagQ = false;
		}
		if(dosa > 0){
			System.out.println("Quantity of Dosa : " + dosa);
			availableFlagQ = false;
		}
		if(pouches > 0){
			System.out.println("Quantity of Pouches is : " + pouches);
			availableFlagQ = false;
		}
		if(paniPuri > 0){
			System.out.println("Quantity of Panipuri is : " + paniPuri);
			availableFlagQ = false;
		}
		if(masala > 0){
			System.out.println("Quantity of Masala is : " + masala);
			availableFlagQ = false;
		}
		if (availableFlagQ == true)
			System.out.println("No items available.");
	}
	
	public static void main(String[] args){
		A9_shop a9_shop1 = new A9_shop();
		a9_shop1.purchaseItem(41,50,39,25,100);
		a9_shop1.outOfStock();
		a9_shop1.availableItems();
	}
}