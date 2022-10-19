public class Seller extends Person {
	Seller(){
		//super(theProductMenu);
	}
	Seller(ProductMenu ProductMenu){
		//super(theProductMenu);
	}
	public void showMenu() {
		System.out.println("Seller menu product ->");
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
