package sxx.collection;

public class List<E> implements Collection<E>{
	private Object[] obj = new Object[5];
	int i = 0;
	@Override
	public void add(E e) {
		Object[] obj2 = new Object[obj.length*2];
		if(i == obj.length){
			System.arraycopy(obj, 0, obj2, 0, obj.length);
		}
		obj[i] = e;
		i++;
	
	}

	@Override
	public E get() {
		// TODO Auto-generated method stub
		return null;
	}

}
