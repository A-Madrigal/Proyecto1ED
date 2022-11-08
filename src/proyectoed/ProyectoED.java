package proyectoed;
import java.util.LinkedList;
import java.util.Scanner;
public class ProyectoED {
    public static void main(String[] args) {
        Scanner OP = new Scanner(System.in);
        int opci = 0;
        while (opci != 5) {
            System.out.println("POR FAVOR DIGITE UNA DE LAS OPCIONES...!");

            System.out.println("1-Insertar una nueva medicina");
            System.out.println("2-Insertar paciente y sus medicamentos");
            System.out.println("3-Imprimir los pacientes sin medicamentos");
            System.out.println("4-Borrar medicamentos que no tome ningun paciente");
            System.out.println("-------------------");
            System.out.println("5-SALIR DEL SISTEMA");
            System.out.println(" ");
            opci = OP.nextInt();
            switch (opci) {
                case 1:
                    Nueva_Medicina();
                    break;
                case 2:
                    Insertar_Paciente();
                    break;
                case 3:
                    ImprimirPacientes();
                    break;
                case 4:
                    BorrarMedicamentos();
                    break;
                default:
                    System.out.println("SALIENDO DEL SISTEMA.....");
                    break;
            }
        }
    }

    public static void Nueva_Medicina() {
        LinkedList<String> L_Medicamentos = new LinkedList<>();

        L_Medicamentos.add("Paracetamol");
        L_Medicamentos.add("Aspirina");
        L_Medicamentos.add("Ibuprofeno");
        L_Medicamentos.add("Analgesicos");

        System.out.println("Medicamentos: " + L_Medicamentos);

        System.out.println("Ingrese el nombre de la medicina: ");
        Scanner NM = new Scanner(System.in);
        String NMedicina = NM.next();

        L_Medicamentos.add(NMedicina);
        System.out.println("El nuevo medicamento es: " + NMedicina);

        System.out.println("Cantidad de medicamentos es; " + L_Medicamentos.size());
    }

    public static void Insertar_Paciente() {
        System.out.println("Ingrese el nombre del paciente: ");
        Scanner Teclado = new Scanner(System.in);
        String NPaciente = Teclado.nextLine();

        Pacientes p = new Pacientes(NPaciente);

        LinkedList<Medicamentos> M = new LinkedList<>();
        String Med;

        System.out.println("Digite el nombre del medicamento:");
        Med = Teclado.nextLine();

        System.out.println("Desea agregar otro medicamento? S para Si");
        Med = Teclado.nextLine();

        do {
            Medicamentos Mt = new Medicamentos(Med);

            System.out.println("Digite el nombre:");
            Mt.setNombre(Teclado.nextLine());

            M.add(Mt);

            System.out.println("Desea agregar otro medicamento? S para Si");
            Med = Teclado.nextLine();

        } while (Med.equals("S"));
        System.out.println("El nombre del paciente es: " + NPaciente);
        System.out.println("Y los medicamentos son: " + M);

    }

    public static void ImprimirPacientes() {
        LinkedList IP = new LinkedList<>();
        IP.add("Veronica");

        Pacientes Paracetamol = new Pacientes("Juan");
        Paracetamol.setNombre("Jimena");

        Pacientes Aspirina = new Pacientes("Dawren");
        Aspirina.setNombre("Allen");
        Aspirina.setNombre("Jimena");

        Pacientes Ibuprofeno = new Pacientes("Nicol");
        Ibuprofeno.setNombre("Arturo");

        Pacientes Analgesicos = new Pacientes("");

        System.out.println("La paciente que no tiene medicamentos es: " + IP);
    }

    public static void BorrarMedicamentos() {
        Scanner B = new Scanner(System.in);
        LinkedList<String> L_Medicamentos = new LinkedList<>();

        L_Medicamentos.add("Paracetamol");
        L_Medicamentos.add("Aspirina");
        L_Medicamentos.add("Ibuprofeno");
        System.out.println("Estos medicamentos si tiene pacientes: " + L_Medicamentos);

        System.out.println("Los medicamentos que no son tomados por nadie son:");
        LinkedList<String> B_Medicamentos;
        B_Medicamentos = new LinkedList<>();
        B_Medicamentos.add("Analgesicos");
        System.out.println(B_Medicamentos);
        System.out.println("Desea borrarlo? Precione 1 para confirmar");
        int Borrar = B.nextInt();
        System.out.println("Se borro de la lista.");
    }
}

