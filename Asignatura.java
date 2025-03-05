// Clase Asignatura refactorizada

public class Asignatura {
    private long id;
    private String nombre;
    private int horas;
    private int creditos;
    private boolean disponible;

    public Asignatura(long id, String nombre, int horas, int creditos, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
        this.creditos = creditos;
        this.disponible = disponible;
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

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}


