package persona;

import java.util.Scanner;

public class persona {
    
    String tipoDoc, nombre, apellido, sexo, tipoPeso;
    int documento, edad;
    double peso, estatura , imc;

    public persona(){

    }
    
    public persona(String tipoDoc, String nombre, String apellido, String sexo, String tipoPeso, int documento,
            int edad, double peso, double estatura, double imc) {
        this.tipoDoc = tipoDoc;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.tipoPeso = tipoPeso;
        this.documento = documento;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
        this.imc = imc;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getTipoPeso() {
        return tipoPeso;
    }
    public void setTipoPeso(String tipoPeso) {
        this.tipoPeso = tipoPeso;
    }
    public int getDocumento() {
        return documento;
    }
    public void setDocumento(int documento) {
        this.documento = documento;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getImc() {
        return imc;
    }
    public void setImc(double imc) {
        this.imc = imc;
    }
    Scanner lector = new Scanner(System.in);
    public void  pedirDatos() {
    System.out.println("Ingresa el tipo de documento:");
    setTipoDoc(lector.next());
    System.out.println("Ingresa el documento:");
    setDocumento(lector.nextInt());
    System.out.println("Ingresa el nombre:");
    setNombre(lector.next());
    System.out.println("Ingresa el apellido:");
    setApellido(lector.next());
    System.out.println("Ingresa el peso en kg:");
    setPeso(lector.nextDouble());
    System.out.println("Ingresa la estatura(m):");
    setEstatura(lector.nextDouble());
    System.out.println("Ingresa la edad:");
    setEdad(lector.nextInt());
    System.out.println("Ingresa tu sexo:");
    setSexo(lector.next());
    }
    public void  mostrarPersona() {
        System.out.println("Nombre: " + getNombre() + " Apellido: " + getApellido() + " Tipo Documento: " + getTipoDoc() + " Documento: " + getDocumento() + "\n" + " edad " + getEdad() + " Peso: " + getPeso() + " Estatura: " + getEstatura() + " Sexo: " + getSexo());
    }
    public String calcularImc() {

        imc = peso/(estatura)* 2; 
        if (imc<20){
            setTipoPeso("PESOBAJO"); 
        }else if (imc >= 20 && imc <= 25){
            setTipoPeso("PESOIDEAL"); 
        }else if(imc>25){
            setTipoPeso("SOBREPESO"); 
        }
        return tipoPeso;
    }   
    public void mayorEdad(){
        if (edad>= 18){
            System.out.println("Es mayor de edad");
        }else if (edad<18){
            System.out.println("Es menor de edad");
        }
    }
}
