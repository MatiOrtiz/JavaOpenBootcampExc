public class Coche {
    private int puertas;

    public Coche(int p) {
        puertas = p;
    }

    public void incrementar(int p) {
        puertas += p;
    }

    public int obtenerPuertas() {
        return puertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche(2);
        miCoche.incrementar(2);
        System.out.println("La cantidad de puertas del auto es: " + miCoche.obtenerPuertas());
    }
}
