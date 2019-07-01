package sxx.collection;
import sxx.collection.List;
import sxx.collection.Collection;
public class Test {
	public static void main(String[] args) {
		//Collection<Integer> co = new List<>();
		Collection<Integer> co = new LinkedList<>();
		for(int i = 0;i<5;i++){
			co.add(i);
		}
		System.out.print(co);
	}
}
