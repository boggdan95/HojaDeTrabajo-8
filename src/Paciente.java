
// TODO: Auto-generated Javadoc
/**
 * The Class Paciente.
 */
public class Paciente implements Comparable<Paciente> {
    
    /** The nombre. */
    private String nombre;
    
    /** The enfermedad. */
    private String enfermedad;
    
    /** The codigo. */
    private String codigo;

    /**
     * Instantiates a new paciente.
     *
     * @param nombre the nombre
     * @param enfermedad the enfermedad
     * @param codigo the codigo
     */
    public Paciente(String nombre, String enfermedad,String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.enfermedad = enfermedad;
    }
   

    /**
     * Gets the nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Gets the codigo.
     *
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Gets the enfermedad.
     *
     * @return the enfermedad
     */
    public String getEnfermedad() {
        return enfermedad;
    }

    /**
     * Sets the nombre.
     *
     * @param nombre the new nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Sets the codigo.
     *
     * @param codigo the new codigo
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Sets the enfermedad.
     *
     * @param enfermedad the new enfermedad
     */
    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    /* (non-Javadoc)
     * @see java.lang.Comparable#compareTo(java.lang.Object)
     */
    public int compareTo(Paciente nuevoPaciente) {
              
       return codigo.compareTo(nuevoPaciente.getCodigo());
    }

    

    
}

