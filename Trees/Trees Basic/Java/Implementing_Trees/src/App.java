
public class App {

	public static void main(String[] args) {

		Trees t1 = new Trees();
		t1.insert(27);
		t1.insert(19);
		t1.insert(14);
		t1.insert(35);
		t1.insert(42);
		t1.insert(10);
		t1.insert(31);

		t1.inOrderPrint();
		t1.preOrderPrint();
		t1.postOrderPrint();
	}

}
