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
    
    private boolean estaVacio() {
        return i == 0;
    }

    private boolean estaLleno() {
        return i == tam;
    }

    public boolean agregar(Alumno alumno) {
        if (estaLleno()) {
            System.out.println("El arreglo está lleno. No se puede agregar un nuevo alumno.");
            return false;
        }
        alumnos[i] = alumno;
        i++;
        return true;
    }

    public Alumno buscar(String codigo) {
        for (int j = 0; j < i; j++) {
            if (alumnos[j].getCodigo().equals(codigo)) {
                return alumnos[j];
            }
        }
        return null;
    }
    
    public void ordenarBurbuja(int campo, String valor) {
        for (int j = 0; j < i - 1; j++) {
            for (int k = 0; k < i - j - 1; k++) {
                boolean comparar = false;

                if (campo == 1) {
                    comparar = alumnos[k].getCodigo().compareTo(alumnos[k + 1].getCodigo()) > 0;
                } else if (campo == 2) {
                    comparar = alumnos[k].getNombre().compareTo(alumnos[k + 1].getNombre()) > 0;
                }

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