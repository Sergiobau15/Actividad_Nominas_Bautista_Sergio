public class Empleado {
    private String nombre;
    private String apellido;
    private int documento;
    private int diasTrabajados;
    private double salarioBase;
    private int subsidioTransporte;

    public Empleado(String nombre, String apellido, int documento, int diasTrabajados, double salarioBase, int subsidioTransporte) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.diasTrabajados = diasTrabajados;
        this.salarioBase = salarioBase;
        this.subsidioTransporte = subsidioTransporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getSubsidioTransporte() {
        return subsidioTransporte;
    }
}
