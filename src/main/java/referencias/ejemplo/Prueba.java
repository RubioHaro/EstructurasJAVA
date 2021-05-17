package referencias.ejemplo;

public class Prueba {
    public static void main(String[] args) {
        Mensaje cabeza = new Mensaje("Mensaje1");
        Mensaje m2 = new Mensaje("Mensaje2");

        System.out.println(cabeza);
        System.out.println(m2);

        m2 = cabeza; // Se pasando la referencia
        m2.setContenido("Mensaje 2");

        System.out.println(cabeza);
        System.out.println(m2);

    }
}
