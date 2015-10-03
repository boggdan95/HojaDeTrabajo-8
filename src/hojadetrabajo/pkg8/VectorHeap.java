
import java.util.PriorityQueue;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Alicia-Lester
 */
public class VectorHeap <E extends Comparable<E>> extends PriorityQueue<E>{

    protected Vector<E> data;
    
    public VectorHeap() {
        
        data = new Vector<E>();
    }
    
    
    
    
}
