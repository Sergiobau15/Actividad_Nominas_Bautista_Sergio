import java.util.ArrayList;
import java.util.Scanner;

public class Nominas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        System.out.println("Ingrese la cantidad de empleados a liquidar:");
        int cantidadEmpleados = scanner.nextInt();

        // Capturar los datos de los empleados
        for (int i = 0; i < cantidadEmpleados; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            String nombre = scanner.next();

            System.out.println("Ingrese el apellido del empleado " + (i + 1) + ":");
            String apellido = scanner.next();

            System.out.println("Ingrese el documento del empleado " + (i + 1) + ":");
            int documento = scanner.nextInt();

            System.out.println("Ingrese los días trabajados del empleado " + (i + 1) + ":");
            int diasTrabajados = scanner.nextInt();

            System.out.println("Ingrese el salario base del empleado " + (i + 1) + ":");
            double salarioBase = scanner.nextDouble();

            System.out.println("Ingrese el subsidio de transporte del empleado " + (i + 1) + ":");
            int subsidioTransporte = scanner.nextInt();

            empleados.add(new Empleado(nombre, apellido, documento, diasTrabajados, salarioBase, subsidioTransporte));
        }

        // Realizar la liquidación de nómina para cada empleado
        System.out.println("\n--- Liquidación de Nómina ---");
        for (Empleado empleado : empleados) {
            double salarioBase = empleado.getSalarioBase();
            int diasTrabajados = empleado.getDiasTrabajados();
            double salarioPorDia = salarioBase / 30; // Suponiendo un mes de 30 días
            double salarioTotal = salarioPorDia * diasTrabajados;

            double devengos = 500.0; // Ejemplo de devengos adicionales
            salarioTotal += devengos;

            double seguridadSocial = salarioBase * 0.10; // Ejemplo de descuento de seguridad social (10%)
            double retencionImpuestos = salarioBase * 0.15; // Ejemplo de retención de impuestos (15%)
            double salarioFinal = salarioTotal - seguridadSocial - retencionImpuestos;

            System.out.println("\nEmpleado: " + empleado.getNombre() + " " + empleado.getApellido());
            System.out.println("Documento: " + empleado.getDocumento());
            System.out.println("Días Trabajados: " + empleado.getDiasTrabajados());
            System.out.println("Salario Base: $" + salarioBase);
            System.out.println("Salario Total: $" + salarioTotal);
            System.out.println("Devengos: $" + devengos);
            System.out.println("Descuento Seguridad Social: $" + seguridadSocial);
            System.out.println("Retención Impuestos: $" + retencionImpuestos);
            System.out.println("Salario Final: $" + salarioFinal);
        }
    }
}
