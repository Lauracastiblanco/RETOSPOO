package retospoo;

public class empleado extends Persona{
    private String cargo, departamento; 
    private double valorHora, honorario; 
    private int horasTrabajadas;

    public empleado(){

    }
    
    public empleado(String nombre, String apellido, String tipoDocumento, int documento, String cargo,
            String departamento, double valorHora, int horasTrabajadas, double honorario) {
        super(nombre, apellido, tipoDocumento, documento);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.honorario = honorario;
    }

    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getHonorario() {
        return honorario;
    }
    public void setHonorario(double honorario) {
        this.honorario = honorario;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    } 
    
    public void calcularHonorarios(double valorHora, int horasTrabajadas){

        final double reteica = 0.966;
        honorario = (valorHora * horasTrabajadas) * reteica;
    }

    public void mostrarEmpleado(){
        System.out.println("Tipo de Documento " + getTipoDocumento() + "\nNumero de Documento: " + getDocumento() + 
        "\nNombre Empelado: " + getNombre() + "\nApellido Empleado: " + getApellido() + "\nCargo: " + getCargo() +
         "\nHoras Trabajadas: " + getHorasTrabajadas() + "\nValor por hora: " + getValorHora() + "\nTotal a pagar: " + getHonorario());
    }
}
