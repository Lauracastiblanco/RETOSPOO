package principal;
import persona.*;
public class inicio {
    public static void main(String[] args) {
        persona laura = new persona();
        laura.pedirDatos();
        laura.mostrarPersona();
        laura.calcularImc();
        if (laura.getTipoPeso() == "PESOBAJO") {
            System.out.println("Esta por debajo de lo ideal");
          } else if (laura.getTipoPeso() == "PESOIDEAL") {
            System.out.println("El peso es el ideal");
          } else if (laura.getTipoPeso() == "SOBREPESO") {
            System.out.println("Tiene sobrepeso");
          }
        laura.mayorEdad();
    }
}
