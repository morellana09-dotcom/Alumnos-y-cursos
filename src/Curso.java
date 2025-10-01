import java.util.ArrayList;


public class Curso {
    Alumno a = new Alumno();
    private String nombre;
    private String codigo;
    private ArrayList<Alumno> alumnos;

    public Curso(String nombre, String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
        this.alumnos = new ArrayList<>();
    }

    //Metodos
    public void eliminarAlumno(String matricula){
        if (alumnos.isEmpty()){
            System.out.println("La lista esta vacia, no hay alumnos para elimimar");
            return;
        } else if (!verificarAlumno(matricula)){
            System.out.println("El alumno no pertenece a la lista");
            return;
        } else {
            alumnos.removeIf(a -> a.getMatricula().equals(matricula));
            System.out.println("Alumno de matricula " + matricula + "ha sido eliminado" );
            return;
        }
    }
    public void agregarAlumno(Alumno alumno) {
        if (alumno == null){
            System.out.println("Le faltan datos al alumno");
            return;
        } else if (verificarAlumno(alumno.getMatricula())){
            System.out.println("El alumno ya se encuentra en la lista");
            return;
        } else {
            alumnos.add(alumno);
        }
    }

    public boolean verificarAlumno(String matricula){
        for (Alumno a : alumnos){
            if (a.getMatricula().equals(matricula)){
                return true;
            }
        } return false;
    }

    //toString
    public String toString() {
        String Listafinal = nombre + " " + codigo + "\n"
                + "Alumnos inscritos:" + "\n";

        if (alumnos.isEmpty()) {
            Listafinal += " - No hay alumnos inscritos";
        } else {
            for (Alumno a : alumnos) {
                Listafinal += " - " + a.toString() + "\n";
            }
        }
        return Listafinal;
    }
}
/* Respuesta (control de avanze): Si, logre crear la clase, tuve que buscar si como podia reducir el metodo eliminar alumno, de ahi obtuve
la funcion alumnos.removeIf(....)*/
