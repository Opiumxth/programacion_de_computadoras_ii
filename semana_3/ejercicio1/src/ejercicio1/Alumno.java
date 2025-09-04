package ejercicio1;

public class Alumno {
    private String codigo;
    private String nombre;
    private String apellido;
    private String dni;
    private double promedio;
    
    public Alumno(){
        codigo = " ";
        nombre = " ";
        apellido = " ";
        dni = " ";
        promedio = 0;
    }
    
    public Alumno(String codigo, String nombre, String apellido, String dni, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Alumno{" + "codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", promedio=" + promedio + '}';
    }
    
}