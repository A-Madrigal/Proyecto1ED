package proyectoed;

import java.util.LinkedList;

public class Medicamentos {
    private String Nombre;
    LinkedList<String> Medicamentos = new LinkedList<>();

    public Medicamentos(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void AgregarMedicamento(String Nombre) {
        Medicamentos.add(Nombre);
    }

    public int CantidadMedicamentos() {
        return Medicamentos.size();
    }

    public void setMedicamentos(LinkedList<String> Medicamentos) {
        this.Medicamentos = Medicamentos;
    }

}
