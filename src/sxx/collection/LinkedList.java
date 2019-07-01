package sxx.collection;

public class LinkedList<E> implements Collection<E>{
	private Node<E> head = null;
	private Node<E> tail = null;
	
	@Override
	public void add(E e) {
		Node<E> node = new Node(e,null);
		if(head == null){
			head = node;
			tail = node;	
		}
		tail.setNext(node);
		tail = node;
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

}
