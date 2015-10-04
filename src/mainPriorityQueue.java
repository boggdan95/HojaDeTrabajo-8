import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

// TODO: Auto-generated Javadoc
/**
 * The Class mainPriorityQueue.
 */
public class mainPriorityQueue {
	
	/**
	 * The main method.
	 *
	 * @param args the command line arguments
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        //Se crea un objeto de la clase vectortorHeap
    	PriorityQueue<Paciente> vector = new PriorityQueue<Paciente>();
        
    	
    	
        
        	 // Abrimos el archivo
        	FileReader fileReader = new FileReader("pacientes.txt");
    		BufferedReader buffer = new BufferedReader(fileReader);
    		
    		 
    		
    		String pacientes;
    	     
            String[] pacientePrioridad;
            
            int noPacientes = 0;
            
            
                  
        	
        	while((pacientes = buffer.readLine()) != null){
                    
                        pacientePrioridad = pacientes.split(", ");
                    
        		        vector.add(new Paciente(pacientePrioridad[0],pacientePrioridad[1],pacientePrioridad[2]));
            
                        noPacientes++;
        	}
        buffer.close();
    
        
        
        
        
        //Se muestran las prioridades ya ordenadas
         for (int i = 0; i < noPacientes; i++){
        	 	Paciente paciente = (Paciente)vector.poll();
           		
           		System.out.println(">>Nombre: " + paciente.getNombre()+" Enfermedad: "+ paciente.getEnfermedad() + " Prioridad: " + paciente.getCodigo());
            	}
            
       
}

}
