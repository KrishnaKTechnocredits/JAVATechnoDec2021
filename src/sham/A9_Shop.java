package sham;

public class A9_Shop {

	int availableMaggieQuantity=50;
	int availableDosaQuantity=43;
	int availablePouchesQuantity=39;
	int availablePanipuriQuantity=43;
	int availableMasalasQuantity=73;
	
	void purchaseItem(int requstedMaggie,int requestedDosa,int requestedPouches, int requestedPanipuri, int requestedMasala) {
		if(requstedMaggie<availableMaggieQuantity) {
			availableMaggieQuantity = availableMaggieQuantity-requstedMaggie;
			System.out.println("you have purchased "+requstedMaggie+" Maggie  Thank YOU... Visit Again!!!");
		}
		else
			System.out.println("Insuffiecient Quantities for Maggie.. Sorry");
		
		if(requestedDosa<availableDosaQuantity) {
			availableDosaQuantity = availableDosaQuantity-requestedDosa;
			System.out.println("you have purchased "+requestedDosa+" Dosa Thank YOU... Visit Again!!!");
		}
		else
			System.out.println("Insuffiecient Quantities for Dosa.. Sorry");
		
		if(requestedPouches<availablePouchesQuantity) {
			availablePouchesQuantity = availablePouchesQuantity-requestedPouches;
			System.out.println("you have purchased "+requestedPouches+" Pouches Thank YOU... Visit Again!!!");
		}
		else
			System.out.println("Insuffiecient Quantities for Pouches.. Sorry");
		
		if(requestedPanipuri<availablePanipuriQuantity) {
			availablePanipuriQuantity = availablePanipuriQuantity-requestedPanipuri;
			System.out.println("you have purchased "+requestedPanipuri+" Panipuri Thank YOU... Visit Again!!!");
		}
		else
			System.out.println("Insuffiecient Quantities for Panipuri.. Sorry");
		
		if(requestedMasala<availableMasalasQuantity) {
			availableMasalasQuantity = availableMasalasQuantity-requestedMasala;
			System.out.println("you have purchased "+requestedMasala+" Masala Thank YOU... Visit Again!!!");
		}
		else
			System.out.println("Insuffiecient Quantities for Masala.. Sorry");
		
	}
	
	void printOutOfStockItem(){
		if(availableMaggieQuantity<0) {
			System.out.println("Maggie is Out of stock");
		}
		if(availableDosaQuantity<0) {
			System.out.println("Dosa is Out of stock");
		}
		if(availablePouchesQuantity<0) {
			System.out.println("Pouches is Out of stock");
		}
		if(availablePanipuriQuantity<0) {
			System.out.println("Panipuri is Out of stock");
		}
		
		if(availableMasalasQuantity<0) {
			System.out.println("Masalas is Out of stock");
		}
	}
	
	void printAvailableStockItem() {
		if(availableMaggieQuantity>0) {
			System.out.println("Maggie is Available in stock,number of Quantities are: "+availableMaggieQuantity);
		}
		if(availableDosaQuantity>0) {
			System.out.println("Dosa is Available in stock,number of Quantities are: "+availableDosaQuantity);
		}
		if(availablePouchesQuantity>0) {
			System.out.println("Pouches is  Available in stock ,number of Quantities are: "+availablePouchesQuantity);
		}
		if(availablePanipuriQuantity>0) {
			System.out.println("Panipuri is  Available in stock ,number of Quantities are: "+availablePanipuriQuantity);
		}
		
		if(availableMasalasQuantity>0) {
			System.out.println("Masalas is  Available in stock ,number of Quantities are: "+ availableMasalasQuantity );
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		A9_Shop shop = new A9_Shop();
		shop.purchaseItem(40, 13, 33, 20, 83);
		shop.printAvailableStockItem();
		shop.printOutOfStockItem();
		
		
	}

}
