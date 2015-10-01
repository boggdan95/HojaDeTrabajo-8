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
public class Paciente<E> implements Comparable<Paciente> {
    
    private String nombre;
    private char codigo;
    private String enfermedad;

    public String getNombre() {
        return nombre;
    }

    public char getCodigo() {
        return codigo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(char codigo) {
        this.codigo = codigo;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
    
    @Override
    public int compareTo(Paciente nuevoPaciente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
