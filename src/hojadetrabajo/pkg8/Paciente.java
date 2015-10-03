/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hojadetrabajo.pkg8;


/**
 *
 * @author Alicia-Lester
 */
public class Paciente implements Comparable<Paciente> {
    
    private String nombre;
    private String codigo;
    private String enfermedad;

    public Paciente(String nombre, String codigo, String enfermedad) {
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
