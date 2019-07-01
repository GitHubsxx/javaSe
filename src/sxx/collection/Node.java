package sxx.collection;

public class Node<E> {

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
	private Object data;//数据
	private Node<E> next;//下一个引用
	
	Node(E data,E next){
		this.data=data;
		this.next=(Node<E>) next;
	}
	
	
}
