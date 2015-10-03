
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
    	
    	//Se crea un objeto de la clase VectorHeap
    	VectorHeap vec = new VectorHeap();
    	
        try{
        	BufferedReader in = new BufferedReader(new FileReader("C:/Users/MS/Documents/Java 2/Hoja8/src/pacientes.txt"));
        	
        	//Se separan los datos de los pacientes, nombre, sintoma y prioridad
        	String d;
        	d = in.readLine();
        	String[] ar = d.split(",");
        	System.out.println(d);
        	System.out.println(ar[0]);
        	System.out.println(ar[1]);
        	System.out.println(ar[2]);
        	
        	//Se manda la prioridad a VectorHeap
        	vec.add(ar[2]);
        	
        	while((d = in.readLine()) != null){
        		System.out.println(d);
        		String[] arr = d.split(",");
            	System.out.println(arr[0]);
            	System.out.println(arr[1]);
            	System.out.println(arr[2]);
            	//Se manda la prioridad a VectorHeap
            	vec.add(arr[2]);
        	}
        	
        	System.out.println("---");
        	
        	//Se muestran las prioridades ya ordenadas
        	for (int i = 0; i < 4; i++){
        		System.out.println(vec.poll());
        	}
        	
        	
        } catch (IOException e){
        	
        	//Mensaje de error si no se encuentra el archivo
        	System.out.println("Error de lectura");
        }
    }
    
    public void imprimirfinal(){
    	System.out.println("");
    }
}
 
