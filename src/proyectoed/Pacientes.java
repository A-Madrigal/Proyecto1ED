
package proyectoed;

import java.util.LinkedList;

public class Pacientes {

    private String Nombre;
    LinkedList<String> Pacientes = new LinkedList<>();

    public Pacientes(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public void AgregarPaciente(String Nombre){
        Pacientes.add(getNombre());
    }
    public int CantidadPacientes() {
        return Pacientes.size()+1;
    }

    public void setPacientes(LinkedList<String> Pacientes) {
        this.Pacientes = Pacientes;
    }

}
