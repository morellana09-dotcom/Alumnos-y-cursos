import java.lang.ref.SoftReference;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un curso
        Curso POO = new Curso("Programación Orientada a Objetos", "ICC490-1");

        // Crear alumnos
        Alumno A1 = new Alumno("Marcelo", "orellana", "22074033124", "Ing. Civil Informática");
        Alumno A2 = new Alumno("Alumno", "Generico", "11111111111", "Ing. Civil Informática");
        Alumno A3 = new Alumno("Mario", "verde", "22222222222", "Ing. Civil Informática");
        Alumno A4 = new Alumno("Sonic", "rojo", "33333333333", "Ing. Civil Informática");
        Alumno A5 = new Alumno("Messi", "Ronaldo", "44444444444", "Ing. Civil Informática");

        POO.agregarAlumno(A1);
        POO.agregarAlumno(A2);
        POO.agregarAlumno(A3);
        POO.agregarAlumno(A4);
        POO.agregarAlumno(A5);
        System.out.println(POO);

        //Agregar
        POO.agregarAlumno(new Alumno("Alumno", "prueba", "55555555555", "Ing. Civil Informática"));
        System.out.println(POO);

        //Eliminar
        POO.eliminarAlumno("55555555555");
        System.out.println(POO);

        //verificar alumno
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese la matricula del alumno: ");
        String matricula = sc.nextLine();
        if (POO.verificarAlumno(matricula)) {
            System.out.println("El alumno pertenece al curso");
        } else {
            System.out.println("El alumno no pertenece al curso");
        }
    }
}

