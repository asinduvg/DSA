
public class Trees {

	Node root;

	public Trees() {
		this.root = null;
	}

	public void insert(int num) {
		Node newNode = new Node(num);
		if (root == null) {
			root = newNode;
		} else {
			traverse(root, newNode);
		}
	}

	public void traverse(Node temp, Node ins) {
		if (temp.data < ins.data) {
			if (temp.rchild == null) {
				temp.rchild = ins;
				return;
			}
			traverse(temp.rchild, ins);
		}

		if (temp.data > ins.data) {
			if (temp.lchild == null) {
				temp.lchild = ins;
				return;
			}
			traverse(temp.lchild, ins);
		}
	}

	public void inOrderPrint() {
		inOrderTraverse(root);
		System.out.println();
	}

	public void preOrderPrint() {
		preOrderTraverse(root);
		System.out.println();
	}

	public void postOrderPrint() {
		postOrderTraverse(root);
		System.out.println();
	}

	public void inOrderTraverse(Node temp) {
		if (temp == null) {
			return;
		}
		inOrderTraverse(temp.lchild);
		System.out.print(temp.data + " -> ");
		inOrderTraverse(temp.rchild);
	}

	public void preOrderTraverse(Node temp) {
		if (temp == null) {
			return;
		}
		System.out.print(temp.data + " -> ");
		inOrderTraverse(temp.lchild);
		inOrderTraverse(temp.rchild);
	}

	public void postOrderTraverse(Node temp) {
		if (temp == null) {
			return;
		}
		inOrderTraverse(temp.lchild);
		inOrderTraverse(temp.rchild);
		System.out.print(temp.data + " -> ");
	}
}
