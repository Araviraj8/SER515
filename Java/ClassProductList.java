public class ClassProductList {

	private Product[] product;

	private ReminderVisitor reminderVisitor;

	private ProductIterator productIterator;

	public void accept(NodeVisitor visitor) {
		System.out.println("Class Product List");

	}

}
