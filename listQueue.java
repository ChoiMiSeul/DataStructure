package datastructure;
import java.util.NoSuchElementException;

class QueueNode <E>{
	char item;
	QueueNode next;
	
	public QueueNode() {
		this.next=null;
	}
	
	public QueueNode(char item) {
		this.item=item;
		next=null;
	}
	
	public char getItem() {
		return this.item;
	}
	
}

class LinkedQueue {
	private QueueNode front;
	private QueueNode rear;
	
	public LinkedQueue() {
		front=null;
		rear=null;
	}
	
	public boolean isEmpty() {
		return(front==null);
	}
	
	public void add(char item) {
		QueueNode node=new QueueNode(item);
		
		if(isEmpty()) {
			front=node;
			rear=node;
		}else {
			rear.next=node;
			rear=node;
		}
	}
	
	public char deQueue() {
		if(isEmpty()) {
			return 0;
		}else {
			char item=front.item;
			front=front.next;
			if(front==null) {
				rear=null;
			}
			return item;
		}
	}
	
	public void delete() {
		if(isEmpty()) {
			System.out.println("내용 존재X");
		}else {
			front=front.next;
			if(front==null) {
				rear=null;
			}
		}
	}
	
	public char peek() {
		if(isEmpty()) {
			return 0;
		}else {
			return front.item;
		}
	}
	
	public void print() {
		if(isEmpty()) {
			System.out.println("내용 존재X");
		}else {
			QueueNode node=front;
			while(node!=null) {
				System.out.print(node.item+" ");
				node=node.next;
			}System.out.println();
		}
	}
}

public class listQueue{
	public static void main(String[] args) {
		char deletedItem;
		LinkedQueue queue=new LinkedQueue();
		
		queue.add('A');
		queue.print();
		
		queue.add('B');
		queue.print();
		
		deletedItem=queue.deQueue();
		if(deletedItem!=0) {
			System.out.println("deletedItem: "+deletedItem);
		}
		queue.print();
		
		deletedItem=queue.deQueue();
		if(deletedItem!=0) {
			System.out.println("deletedItem: "+deletedItem);
		}
		queue.print();
		
		deletedItem=queue.deQueue();
		if(deletedItem!=0) {
			System.out.println("deletedItem: "+deletedItem);
		}
		queue.print();
		}
	}
