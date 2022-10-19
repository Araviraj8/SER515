public class Buyer extends Person {
	
	Buyer(){
		//super(theProductMenu);
	}
	
	Buyer(ProductMenu ProductMenu){
		//super(theProductMenu);
	}
	public void showMenu() {
		System.out.println("Buyer menu product ->");
	}

	public ProductMenu CreateProductMenu() {
		String food = "Meat Product Menu";
		if(food.equalsIgnoreCase("Meat Product Menu")) {
			return new MeatProductMenu();
		}
		else {
			return new ProduceProductMenu();
		}
	}

}
