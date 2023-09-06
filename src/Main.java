public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        Alumno alumno1 = new Alumno(12345, "Dectru Ramirez", 3, "Ingeniería Electronica", 85);
        Alumno alumno2 = new Alumno(67890, "Maria Garcia", 2, "Medicina", 75);
        Alumno alumno3 = new Alumno(54321, "Carlos Lopez", 4, "Derecho", 90);
        Alumno alumno4 = new Alumno(12345, "Yoel Coutiño", 7, "Ingeniería Sistemas",62 );
        Alumno alumno5 = new Alumno(12345, "Salma Suarez", 6, "Ingeniería Sistemas", 100);

        lista.agregarAlumno(alumno1);
        lista.agregarAlumno(alumno2);
        lista.agregarAlumno(alumno3);
        lista.agregarAlumno(alumno4);
        lista.agregarAlumno(alumno5);

        System.out.println("Lista de Alumnos:");
        lista.mostrarLista();

        ListaSimple aprobados = lista.filtrarAlumnosAprobados();
        ListaSimple reprobados = lista.filtrarAlumnosReprobados();

        System.out.println("\nAlumnos Aprobados:");
        aprobados.mostrarLista();

        System.out.println("\nAlumnos Reprobados:");
        reprobados.mostrarLista();
    }
}