package datastructure;

class Node {
	private char data;
	private Node left;
	private Node right;

	public Node(char data) {
		this.data = data;
	}

	public char getData() {
		return data;
	}

	public void setData(char data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
}

class Queue {
	private Node[] q;
	private int rear;
	private int front;

	public Queue(int n) {
		q = new Node[n];
		rear = -1;
		front = -1;
	}

	public boolean isEmpty() {
		if (front == rear) {
			return true;
		} else {
			return false;
		}
	}

	public void enqueue(Node item) {
		if (rear == q.length - 1) {
			System.out.println("Queue Full");
			return; // ť full. ���� �Ұ�
		} else {
			rear = rear + 1;
			q[rear] = item; // rear ��ġ�� item ����
		}
	}

	public Node dequeue() {
		if (isEmpty()) { // ���� �� 99��ȯ
			System.out.println("Queue Empty");
			return null;
		} else { // front 1������ ������ ��ȯ
			front = front + 1;
			return q[front];
		}
	}
}

static public void class levelorder(Node node)
{
	Queue que=new Queue(10);
	que.enqueue(node);
	Node n;
	
	while(!que.isEmpty()) {
		n=que.dequeue();
		
		if(n!=null) {
			System.out.println(n.getData());
			que.enqueue(n.getLeft());
			que.enqueue(n.getRight());
		}
	}
}
