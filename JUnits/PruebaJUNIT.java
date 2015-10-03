
public class PruebaJUNIT {
	
	private VectorHeap vec = new VectorHeap();
	
	//se crea un arbol para poner a prueba el metodo de buscar elemento en el arbol
	public void start()
	{
		vec.add("J");
		vec.add("T");
		vec.add("F");
		vec.add("K");
		vec.add("S");
		vec.add("D");
		vec.add("H");
		vec.add("I");
		vec.add("R");
		vec.add("E");
		vec.add("U");
		vec.add("L");
		vec.add("O");
		vec.add("C");
		vec.add("P");
		vec.add("M");
		vec.add("Q");
		vec.add("N");
		vec.add("G");
		vec.add("A");
		vec.add("B");
		vec.add("W");
		vec.add("Z");
		vec.add("Y");
		vec.add("X");
		vec.add("V");
	}
	
	public void ordenDPrioridad(){
		for(int i = 0; i < 26; i++){
			System.out.println(i+". "+vec.poll());
		}
	}
	
	public boolean pruebaPOLL(){
		return vec.poll() == null;
	}
	
	}