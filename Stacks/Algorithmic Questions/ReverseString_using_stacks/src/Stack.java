
public class Stack {

	private int size;
	private char[] stk;
	private int top;

	public Stack(int size) {
		this.size = size;
		stk = new char[size];
		top = -1;
	}

	public void push(char c) {
		if (!isFull()) {
			stk[++top] = c;
		}
	}

	public char pop()  {
		if (!isEmpty()) {
			char popChar = stk[top];
			stk[top--] = 0;
			return popChar;
		}
		return 0;
	}

	public boolean isFull() {
		if (top == size - 1) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public void print() {
		for (int i = 0; i <= top; i++) {
			System.out.println(stk[i]);
		}
	}
}
