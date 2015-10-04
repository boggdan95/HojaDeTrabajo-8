
// TODO: Auto-generated Javadoc
/**
 * The Interface PriorityQueue.
 *
 * @param <E> the element type
 */
public interface PriorityQueue<E extends Comparable<E>> {
    
    
	/**
	 * Gets the first.
	 *
	 * @return the first
	 */
	public E getFirst();
	//pre: !isEmpty()
	/**
	 * Removes the.
	 *
	 * @return the e
	 */
	//post: returns the minimum value in priority queue
	public E remove();
	//pre: !isEmpty
	/**
	 * Adds the.
	 *
	 * @param value the value
	 */
	//post: returns and removes minimum value from queue
	public void add(E value);
	//pre: value is non-null comparable
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	//post: value is added to priority queue
	public boolean isEmpty();
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	//post: returns true if no elements are in queue
	public int size();
	
	/**
	 * Clear.
	 */
	//post: returns number of elements within queue
	public void clear();
	//post: removes all elements from queue
}
