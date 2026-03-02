public class Socio {

    // Atributos privados
    private int numeroSocio;
    private String nombre;

    // Constructor
    public Socio(int numeroSocio, String nombre) {
        this.numeroSocio = numeroSocio; // Asigna el número del socio
        this.nombre = nombre;           // Asigna el nombre del socio
    }

    // Obtengo el numero de socio
    public int getNumeroSocio() {
        return numeroSocio;
    }

    // Obtengo el nombre de socio
    public String getNombre() {
        return nombre;
    }

    // Muestro la información como texto
    public String toString() {
        return "[" + numeroSocio + "]" + nombre;
    }
}