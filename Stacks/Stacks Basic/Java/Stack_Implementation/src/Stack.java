
public class Stack {

	private int size;
	private int[] stk;
	private int top;

	public Stack(int size) {
		this.size = size;
		stk = new int[size];
		top = -1;
	}

	public void push(int num) throws Exception {
		if (!isFull()) {
			stk[++top] = num;
		} else {
			throw new Exception("Stack is Full!!, value " + num + " and after will not be pushed");
		}
	}

	public void pop() throws Exception {
		if (!isEmpty()) {
			stk[top--] = 0;
		} else {
			throw new Exception("Stack is Empty!!");
		}
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
