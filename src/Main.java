public class Main {

    public static void main(String[] args) {

        // Declaramos variables para guardar objetos de tipo Gimnasio
        Gimnasio uaxGym;
        Gimnasio miGym;
        int UAXGYM_SOCIOS;
        int UAXGYM_SALAS;


        // Creo el gimnasio
        miGym = new Gimnasio("1", "JavaGym", 30, 2);
        System.out.println(miGym.toString());

        uaxGym = new Gimnasio("2", "UAXGym", 50, 3);
        System.out.println(uaxGym.toString());

        // Creo dos socios
        Socio socio1 = new Socio(1, "Ana");    // Socio 1
        Socio socio2 = new Socio(2, "Carlos"); // Socio 2

        // Creo dos salas
        Sala sala1 = new Sala(101, "Sala de pesas");  // Sala 101
        Sala sala2 = new Sala(102, "Sala de cardio"); // Sala 102

        // imprimo la información en consola de socios
        System.out.println("Socios:");
        System.out.println(socio1.toString());
        System.out.println(socio2.toString());

        // imprimo la información en consola de salas
        System.out.println("Salas:");
        System.out.println(sala1.toString());
        System.out.println(sala2.toString());
    }
}