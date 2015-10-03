
public class mainJunit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// se crea un objeto de la clase pruebaJUNIT
		PruebaJUNIT prueba = new PruebaJUNIT();
		
		//Se ingresa en desorden el abcdario en el VectorHeap
		prueba.start();
		
		// Si funciona se imprime el abcedario en orden
		// En el metodo ordenDPrioridad se utiliza el metodo poll() el cual debe retirar y mostrar el dato con prioridad al ser llamado.
		prueba.ordenDPrioridad();
		
		// se llama de nuevo el metodo poll() y este debe mostrar null ya que se mostraron y eliminaron todos los elementos previamente
		System.out.println("Si los metodos funcionaron se debe mostrar true:");
		System.out.println("---> "+prueba.pruebaPOLL());
	}

}
