import java.util.Scanner;

public class Facade {

	private int nProductCategory;

	private Products theSelectedProduct;

	private Person thePerson;

	private int UserType;

	private ClassProductList theProductList;

	public void submitBidding() {

	}

	public void remind() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void AttachProductToUser() {

	}

	public boolean login() {
		
		System.out.println("Enter Username");
		Scanner scan = new Scanner(System.in);
		String username = scan.next();
		System.out.println("Enter Password ");
		String password = scan.next();
		
		if ((username.equalsIgnoreCase("tutu")) && (password.equalsIgnoreCase("1111"))) {
			System.out.println("Hi Tutu");
			UserType = 0;
		} else if ((username.equalsIgnoreCase("mimi")) && (password.equalsIgnoreCase("2222"))) {
			System.out.println("Hi Mimi");
			UserType = 0;
		} else if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("3333"))) {
			System.out.println("Hi Pepe");
			UserType = 1;
		} else {
			System.out.println("User not found");
			return false;
		}
		return true;
	
	}

	public void productOperation() {

	}

	public void addTrading() {

	}

	public Product SelectProduct() {
		return null;
	}

	public void createProductList() {

	}

	public void discussBidding() {

	}

	public void createUser(UserInfoltem userinfoitem) {

	}

}
