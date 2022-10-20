import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Facade {

	private int nProductCategory;

	private Products theSelectedProduct;

	private Person thePerson;

	private int UserType;

	private ClassProductList theProductList;
	
	String username;

	public void submitBidding() {

	}

	public void remind() {

	}

	public void viewTrading() {

	}

	public void decideBidding() {

	}

	public void AttachProductToUser() {
		System.out.println("Your Product List:" + "\n");
		
        if(this.username.equalsIgnoreCase("tutu")) {
        	  System.out.println("1. Beef");
        	  System.out.println("2. Tomato");
          }else if(username.equalsIgnoreCase("mimi")) {
        	  System.out.println("1. Beef");
        	  System.out.println("2. Onion");}
        	else if(this.username.equalsIgnoreCase("pepe")) {
        		System.out.println("1. Beef");  
        		System.out.println("2. Tomato");
        		System.out.println("3. Onion");
        	}
        
	    try {
	        File file = new File("UserProduct.txt");
	        Scanner sc = new Scanner(file);
	        while (sc.hasNextLine()) {
	          String st = sc.nextLine();
	          String[] arrofStr = st.split(":");
	          //System.out.println(arrofStr[0]);
	          //System.out.println(arrofStr[1]);
	          

	          }
	          
	        sc.close();
	      } catch (FileNotFoundException e) {
	        System.out.println("Error");
	        e.printStackTrace();
	      }
	    


	}
	public boolean login() {
		
		System.out.println("Enter Username");
		Scanner scan = new Scanner(System.in);
		this.username = scan.next();
		System.out.println("Enter Password ");
		String password = scan.next();
		
		
		if ((username.equalsIgnoreCase("tutu")) && (password.equalsIgnoreCase("1111"))) {
			System.out.println("Buyer Logged In");
			System.out.println("Hi " + this.username + "\n");
			
			UserType = 0;
		} else if ((username.equalsIgnoreCase("mimi")) && (password.equalsIgnoreCase("2222"))) {
			System.out.println("Buyer Logged In");
			System.out.println("Hi " + this.username + "\n");
			
			UserType = 0;
			
		}else if ((username.equalsIgnoreCase("pepe")) && (password.equalsIgnoreCase("3333"))) {
			System.out.println("Seller Logged In");
			System.out.println("Hi " + this.username + "\n");
					
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
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select a Product: ");
		String str = sc.nextLine();
		
		int num = Integer.parseInt(str);
		
		if(username.equalsIgnoreCase("tutu")) {
			
			switch (num) {
			case 1:
				System.out.println("You have selected Beef");break;
			case 2:
				System.out.println("You have selected Tomato");break;
			default:
				System.out.println("Invalid Selection");	
			}
		}
		else if(username.equalsIgnoreCase("mimi")) {
			switch (num) {
			case 1:
				System.out.println("You have selected Beef");break;
			case 2:
				System.out.println("You have selected Onion");break;
			default:
				System.out.println("Invalid Selection");	
			}
		}
		else if(username.equalsIgnoreCase("pepe")) {
			switch (num) {
			case 1:
				System.out.println("You have selected Beef");break;
			case 2:
				System.out.println("You have selected Tomato");break;
			case 3:
				System.out.println("You have selected Onion");break;
			default:
				System.out.println("Invalid Selection");	
			}
		}
		
		return null;
	}

	public void createProductList() {
		
		System.out.println("");
	}

	public void discussBidding() {

	}

	public void createUser(UserInfoltem userinfoitem) {

	}

}
