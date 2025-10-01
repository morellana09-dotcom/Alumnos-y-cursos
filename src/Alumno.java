public class Alumno {
    private String nombre;
    private String apellido;
    private String matricula;
    private String carrera;
    /* Estos son los atributos basicos que pueden definir a un alumno, ademas el tipo de dato
    utilizados para estos, es un string con nivel de encapsulamiento */


    //constructor sin parametros
    public Alumno(){
        this("Nombre","Apellido","00000000000","Carrera");
    }

    //constructor con parametros
    public Alumno(String nombre, String apellido, String matricula, String carrera){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setMatricula(matricula);
        this.setCarrera(carrera);
    }

    //getters
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getCarrera(){
        return carrera;
    }

    //setters
    public void setNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }
    public void setApellido(String apellido) {
        if (apellido == null) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        this.apellido = apellido;
    }
    public void setMatricula(String matricula) {
        if (matricula == null) {
            throw new IllegalArgumentException("La matricula no puede estar vacía");
        }
        this.matricula = matricula;
    }
    public void setCarrera(String carrera) {
        if (carrera == null) {
            throw new IllegalArgumentException("La carrera no puede estar vacía");
        }
        this.carrera = carrera;
    }

    //Metodo toString
    public String toString() {
        return "Alumno = " + nombre + ", " + apellido + ", " + matricula + ", " + carrera;

    }

    /* Respuesta (Control avanze)= Pude crear la clase Alumno, solo que me demore bastante debido a que como cree el
    constructor con set, me marcaba error porqye primero debia crear los setters de cada atributo" */
}

