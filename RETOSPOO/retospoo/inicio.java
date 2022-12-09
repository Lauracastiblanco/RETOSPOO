package retospoo;

import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        empleado empleadito = new empleado();
        System.out.println("Ingresa el tipo de documento: ");
        empleadito.setTipoDocumento(lector.next());
        System.out.println("Ingresa el documento: ");
        empleadito.setDocumento(lector.nextInt());
        System.out.println("Ingresa el nombre del empleado: ");
        empleadito.setNombre(lector.next());
        System.out.println("Ingresa el apellido del empleado: ");
        empleadito.setApellido(lector.next());
        System.out.println("Ingresa el cargo del empleado: ");
        empleadito.setCargo(lector.next());
        System.out.println("Ingresa el valor de la hora: ");
        empleadito.setValorHora(lector.nextDouble());
        System.out.println("Ingresa las horas trabajadas: ");
        empleadito.setHorasTrabajadas(lector.nextInt());
        empleadito.calcularHonorarios(empleadito.getValorHora(), empleadito.getHorasTrabajadas());
        empleadito.mostrarEmpleado();
        lector.close();
    }
}
