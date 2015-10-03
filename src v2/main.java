
//package hojadetrabajo.pkg8;

/**
 *
 * @author Jorge Manrique
 */

import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;


public class main {

	
    public static void main(String[] args) throws Exception{
    	
    	VectorHeap vec = new VectorHeap();
    	
        try{
        	BufferedReader in = new BufferedReader(new FileReader("C:/Users/MS/Documents/Java 2/Hoja8/src/pacientes.txt"));
        	String d;
        	d = in.readLine();
        	String[] ar = d.split(",");
        	System.out.println(d);
        	System.out.println(ar[0]);
        	System.out.println(ar[1]);
        	System.out.println(ar[2]);
        	vec.add(ar[2]);
        	
        	while((d = in.readLine()) != null){
        		System.out.println(d);
        		String[] arr = d.split(",");
            	System.out.println(arr[0]);
            	System.out.println(arr[1]);
            	System.out.println(arr[2]);
            	
            	vec.add(arr[2]);
        	}
        	
        	System.out.println("---");
        	
        	for (int i = 0; i < 4; i++){
        		System.out.println(vec.poll());
        	}
        	
        	
        } catch (IOException e){
        	System.out.println("Error de lectura");
        }
    }
    
    public void imprimirfinal(){
    	System.out.println("");
    }
}
 
