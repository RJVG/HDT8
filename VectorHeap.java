import java.util.*;



public class VectorHeap<E extends Comparable<E>>implements PQueue<E> {
    private Vector<E> vector;
    private int size,i;
    private E temporal;
	

    public VectorHeap(){
        vector = new Vector<E>();
        size = 0;
    }
	

    @Override
    public boolean isEmpty(){
        return size==0;
    }
	

    @Override
    public E getFirst(){
        return vector.firstElement();
    }

    @Override
    public E removeFirst(){
        if (isEmpty()){
        System.out.println("Is Empty");
	}
        HeapSort();
        size--;
	return temporal = vector.remove(0);
}
	

    @Override
    public void add(E val){
	vector.add(val);
	size++;
	HeapSort();
    }
	

    public void HeapSort(){
	i = this.size -1;
	while(Parent(i)){
            if (vector.get(i).compareTo(parent(i)) < 0) {
            Swaap(i, parentIndex(i));
            }
            i--;
        }
    }   
	
    public boolean Parent(int i){
	return i>0;
    }
	
    public E parent(int i){
        return vector.elementAt(parentIndex(i));
    }
	
    public int parentIndex(int i){
        return i/2;
    }
	
    public void Swaap(int a,int b){
        temporal = vector.elementAt(a);
        vector.set(a, vector.elementAt(b));
        vector.set(b,temporal);
    }
	
}
