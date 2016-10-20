public interface PQueue<E> {

	public boolean isEmpty();
	
	public E getFirst();
	
	public E removeFirst();
	
	public void add(E val);
	}
