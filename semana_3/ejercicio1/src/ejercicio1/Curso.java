package ejercicio1;

public class Curso {
    private String codigo;
    private String nombre;
    private int credito;

    public Curso() {
        codigo = " ";
        nombre = " ";        
        credito = 0;    
    }
    
    public Curso(String codigo, String nombre, int credito) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
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

    @Override
    public String toString() {
        return "Curso{" + "codigo=" + codigo + ", nombre=" + nombre + ", credito=" + credito + '}';
    }
    
    
}