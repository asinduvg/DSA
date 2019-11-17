
public class Strings {

	private Stack s1;
	private String str;

	public Strings(String str) {
		s1 = new Stack(str.length());
		this.str = str;
	}

	public void reverseString() {
		for (int i = 0; i < str.length(); i++) {
			s1.push(str.charAt(i));
		}
		for (int i = 0; i < str.length(); i++) {
			System.out.print(s1.pop());
		}
	}
}
