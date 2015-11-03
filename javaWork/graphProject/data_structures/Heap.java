package graphProject.data_structures;

import java.util.HashSet;
import java.util.Set;


public abstract class Heap<T extends Comparable<T>> implements IHeap<T>{

	protected int size;
	protected int capacity;
	protected Set<T> set;
	public int getCapacity() {
		return capacity;
	}

	protected Object[] elements;
	
	
	protected Heap(int capacity){
		size=0;
		this.capacity = capacity;
		elements = new Object[capacity];
		set = new HashSet<T>(capacity);
	}
	
	protected Heap(T[] elements){
		this.elements = elements;
		this.capacity = elements.length;
		size = this.capacity;
		initSet();
	}
	
	
	@SuppressWarnings("unchecked")
	private void initSet() {
		set = new HashSet<T>(this.capacity);
		for (Object object : elements) {
			set.add((T)object);
		}
		
	}

	@Override
	public boolean contains(T key){
		return set.contains(key);
	}
	
	/* (non-Javadoc)
	 * @see graphProject.data_structures.IHeap#getTop()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T peek(){
		if(size>1)
			return (T)elements[0];
		else //TODO throw new no elements found
			return null;
	}
	
	
	@SuppressWarnings("unchecked")
	public T getElement(int index){
		return (T)elements[index];
	}
	
	/* (non-Javadoc)
	 * @see graphProject.data_structures.IHeap#hasValue()
	 */
	@Override
	public boolean isEmpty() {
		return size < 1;
	}
	
	protected int parent(int idx){
		return (int)(Math.ceil(idx/2d) -1);
	}
	
	protected int left(int idx){
		return 2*idx+1;
	}
	
	protected int right(int idx){
		return 2 * idx +2;
	}
}