public class Alumno {
    private final int numeroControl;
    private final String nombre;
    private final int semestre;
    private final String carrera;
    private final double promedio;

    public Alumno(int numeroControl, String nombre, int semestre, String carrera, double promedio) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.semestre = semestre;
        this.carrera = carrera;
        this.promedio = promedio;
    }

    public int getNumeroControl() {
        return numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        return "Número de control: " + numeroControl + "\n" +
               "Nombre: " + nombre + "\n" +
               "Semestre: " + semestre + "\n" +
               "Carrera: " + carrera + "\n" +
               "Promedio: " + promedio;
    }
}

class Nodo {
    private final Alumno alumno;
    private Nodo siguiente;

    public Nodo(Alumno alumno) {
        this.alumno = alumno;
        this.siguiente = null;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
class ListaSimple {
    private Nodo cabeza;

    public ListaSimple() {
        cabeza = null;
    }

    public void agregarAlumno(Alumno alumno) {
        Nodo nuevoNodo = new Nodo(alumno);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
        }
    }

    public void mostrarLista() {
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getAlumno());
            actual = actual.getSiguiente();
        }
    }

    public ListaSimple filtrarAlumnosAprobados() {
        ListaSimple aprobados = new ListaSimple();
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getAlumno().getPromedio() >= 80) {
                aprobados.agregarAlumno(actual.getAlumno());
            }
            actual = actual.getSiguiente();
        }
        return aprobados;
    }

    public ListaSimple filtrarAlumnosReprobados() {
        ListaSimple reprobados = new ListaSimple();
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getAlumno().getPromedio() < 80) {
                reprobados.agregarAlumno(actual.getAlumno());
            }
            actual = actual.getSiguiente();
        }
        return reprobados;
    }

    public void recorrer(Nodo inicio) {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println(actual.getAlumno());
            actual = actual.getSiguiente();
        }
    }
}




