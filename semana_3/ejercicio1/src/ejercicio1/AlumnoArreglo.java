package ejercicio1;

public class AlumnoArreglo {
    private Alumno[] alumnos;
    private int tam;
    private int i;

    // Constructor
    public AlumnoArreglo(int capacidad) {
        alumnos = new Alumno[capacidad];
        tam = capacidad;
        i = 0;
    }

    // Métodos

    // Verificar si el arreglo está vacío
    private boolean estaVacio() {
        return i == 0;  // Si el índice es 0, no hay elementos
    }

    // Verificar si el arreglo está lleno
    private boolean estaLleno() {
        return i == tam;  // Si el índice es igual al tamaño del arreglo, está lleno
    }

    // Agregar un nuevo alumno
    public boolean agregar(Alumno alumno) {
        if (estaLleno()) {
            System.out.println("El arreglo está lleno. No se puede agregar un nuevo alumno.");
            return false;  // No se pudo agregar
        }
        alumnos[i] = alumno;
        i++;  // Incrementa el índice para la siguiente posición
        return true;
    }

    // Buscar un alumno por su código
    public Alumno buscar(String codigo) {
        for (int j = 0; j < i; j++) {
            if (alumnos[j].getCodigo().equals(codigo)) {
                return alumnos[j];  // Se encontró el alumno
            }
        }
        return null;  // No se encontró el alumno
    }

    // Método de ordenación por burbuja (Bubble Sort) basado en un campo
    public void ordenarBurbuja(int campo, String valor) {
        for (int j = 0; j < i - 1; j++) {
            for (int k = 0; k < i - j - 1; k++) {
                boolean comparar = false;

                // Dependiendo del campo, se realiza la comparación
                if (campo == 1) {  // Comparar por código
                    comparar = alumnos[k].getCodigo().compareTo(alumnos[k + 1].getCodigo()) > 0;
                } else if (campo == 2) {  // Comparar por nombre
                    comparar = alumnos[k].getNombre().compareTo(alumnos[k + 1].getNombre()) > 0;
                }

                // Si el valor es "ascendente", intercambiamos según el criterio
                if ((valor.equalsIgnoreCase("ascendente") && comparar) ||
                    (valor.equalsIgnoreCase("descendente") && !comparar)) {
                    Alumno temp = alumnos[k];
                    alumnos[k] = alumnos[k + 1];
                    alumnos[k + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AlumnoArreglo{\n");
        for (int j = 0; j < i; j++) {
            sb.append(alumnos[j].toString()).append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
