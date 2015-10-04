
public class Paciente implements Comparable<Paciente> {
    
    private String nombre;
    private String enfermedad;
    private String codigo;

    public Paciente(String nombre, String enfermedad,String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.enfermedad = enfermedad;
    }
   

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    public int compareTo(Paciente nuevoPaciente) {
              
       return codigo.compareTo(nuevoPaciente.getCodigo());
    }

    

    
}

