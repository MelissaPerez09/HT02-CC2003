//VERSION FINAL

import java.util.ArrayList;
/**
 * @author moises.alonso
 *
 */
public class Stack<T> implements IStack<T> {

	private ArrayList<T> coreList;
	
	public Stack() {
		coreList = new ArrayList<T>();
	}
	
	/** 
	 * ingresa un valor al stack
	 * @param value
	 */
	@Override
	public void push(T value) {		
		coreList.add(0, value);
	}

	/** 
	 * saca el ultimo elemento del stack
	 * @return T
	 */
	@Override
	public T pull() {
		return coreList.remove(0);
	}

	/** 
	 * saca el primer elemento del stack
	 * @return T
	 */
	@Override
	public T peek() {
		return coreList.get(0);
	}

	/** 
	 * cuenta la cantidad de elementos en el stack
	 * @return int
	 */
	@Override
	public int count() {
		return coreList.size();
	}

	/** 
	 * evalua si el stack esta vacio
	 * @return boolean
	 */
	@Override
	public boolean isEmpty() {		
		return coreList.isEmpty();
	}
}
