
public class App {

	public static void main(String[] args) {

		Stack s1 = new Stack(10);
		try {
			s1.push(2);
			s1.push(3);
			s1.push(45);
			s1.push(78);
			s1.push(123);
			s1.push(6);
			s1.push(123);
			s1.push(90);
			s1.push(5);
			s1.push(43);
//			s1.push(45);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			s1.pop();
			s1.pop();
		} catch (Exception e) {
			e.printStackTrace();
		}

		s1.print();

	}

}
