// Clase Matricula refactorizada

import java.util.List;

public class Matricula {
    private long id;
    private String nombre;
    private String apellidos;
    private String dni;
    private int curso;
    private List<Asignatura> asignaturas;

    public Matricula(long id, String nombre, String apellidos, String dni, int curso, List<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.curso = curso;
        this.asignaturas = asignaturas;
    }

    public float costeMatricula() {
        int totalCreditos = calcularTotalCreditos();
        return totalCreditos * 15; // Asumiendo que cada crédito cuesta 15
    }

    // Método auxiliar para calcular el total de créditos
    private int calcularTotalCreditos() {
        int totalCreditos = 0;
        for (Asignatura asignatura : asignaturas) {
            totalCreditos += asignatura.getCreditos();
        }
        return totalCreditos;
    }

    // Getters y Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }
}
