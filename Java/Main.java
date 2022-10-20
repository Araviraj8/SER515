
public class Main {

	public static void main(String[] args) {
		Facade facade = new Facade();
		facade.login();
		facade.AttachProductToUser();
		facade.SelectProduct();
		facade.createProductList();
	}

}
