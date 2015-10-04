import static org.junit.Assert.*;

import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * The Class VectorHeapTest.
 */
public class VectorHeapTest {

	/**
	 * Test.
	 */
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	/** The vector. */
	VectorHeap<String> vector = new VectorHeap();
	
	
	   /**
	 * Test add.
	 */
	@Test
    public void testAdd(){
        
		
        String letra = "Agregado";
        vector.add(letra);
        assertEquals(letra,vector.remove());
    }
    
    /**
	 * Test remove.
	 */
	@Test
    public void testRemove(){
        
        
        String letra="X";
        String letra2="Y";
        vector.add(letra);
        vector.add(letra2);
        String Resultado = "Y";
        String retiro = vector.remove();  
        retiro = vector.remove();         
        assertEquals(Resultado, retiro);   
    }
        
    }
	
	
	


