import java.util.Vector;

// TODO: Auto-generated Javadoc
/**
 * The Class VectorHeap.
 *
 * @param <E> the element type
 */
public class VectorHeap <E extends Comparable<E>> implements PriorityQueue<E>{

	/** The data. */
	protected Vector<E> data;
	
	/**
	 * Instantiates a new vector heap.
	 */
	public VectorHeap(){
		data = new Vector<E>();
	}
	
	/**
	 * Instantiates a new vector heap.
	 *
	 * @param v the v
	 */
	public VectorHeap(Vector<E> v){
		int i;
		data = new Vector<E>(v.size());
		for (i=0; i<v.size(); i++){
			add(v.get(i));
		}
	}
	
	/**
	 * Parent.
	 *
	 * @param i the i
	 * @return the int
	 */
	protected static int parent(int i){
		return (i-1)/2;
	}
	
	/**
	 * Left.
	 *
	 * @param i the i
	 * @return the int
	 */
	protected static int left(int i){
		return 2*i+1;
	}
	
	/**
	 * Right.
	 *
	 * @param i the i
	 * @return the int
	 */
	protected static int right(int i){
		return 2*(i+1);
	}
	
	/**
	 * Percolate up.
	 *
	 * @param leaf the leaf
	 */
	protected void percolateUp(int leaf){
		int parent = parent(leaf);
		E value = data.get(leaf);
		while (leaf > 0 && (value.compareTo(data.get(parent)) < 0)){
			data.set(leaf,data.get(parent));
			leaf = parent;
			parent = parent(leaf);
		}
		data.set(leaf, value);
	}
	
    /**
     * Adds the.
     *
     * @param value the value
     */
        @Override
	public void add(E value){
		data.add(value);
		percolateUp(data.size()-1);
	}
	
	/**
	 * Push down root.
	 *
	 * @param root the root
	 */
	protected void pushDownRoot(int root){
		int heapSize = data.size();
		E value = data.get(root);
		while (root<heapSize){
			int childpos = left(root);
			if(childpos < heapSize){
				if ((right(root) < heapSize) && ((data.get(childpos+1)).compareTo(data.get(childpos))<0)){
					childpos++;
				}
				if((data.get(childpos)).compareTo(value)<0){
					data.set(root, data.get(childpos));
					root = childpos;
				}
				else{
					data.set(root, value);
					return;
				}
			}
			else{
				data.set(root, value);
				return; 
			}
		}
	}
	
	/* (non-Javadoc)
	 * @see PriorityQueue#remove()
	 */
	@Override
	public E remove() {
		//pre: !isEmpty()
		//post: removes and returns the minimum value in priority queue
		E minVal = getFirst();
		data.set(0,data.get(data.size()-1));
		data.setSize(data.size()-1);
		if(data.size()>1){pushDownRoot(0);};
		return minVal;
	}

    /* (non-Javadoc)
     * @see PriorityQueue#getFirst()
     */
    @Override
    public E getFirst() {
        return data.get(0);
    }

    /* (non-Javadoc)
     * @see PriorityQueue#isEmpty()
     */
    @Override
    public boolean isEmpty() {
        return false;
    }

    /* (non-Javadoc)
     * @see PriorityQueue#size()
     */
    @Override
    public int size() {
    		return 0;
    }

    /* (non-Javadoc)
     * @see PriorityQueue#clear()
     */
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
