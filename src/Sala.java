public class Sala {

    // Atributo privado porque solo nos interesa verlo a nosotros
    private int codigoSala;
    private String descripcion;

    // Constructor
    public Sala(int codigoSala, String descripcion) {
        this.codigoSala = codigoSala; // Asigno un codigo a la sala
        this.descripcion = descripcion; // Asigno una descripcion a la sala
    }

    // Obtengo el codigo de la sala
    public int getCodigoSala() {
        return codigoSala;
    }

    // Descripción sala
    public String getDescripcion() {
        return descripcion;
    }

    // Mostrar sala como texto
    public String toString() {
        return "[" + codigoSala + "] " + descripcion;
    }
}