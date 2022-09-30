public class Coche {
    private int puertas;

    public Coche() {
        puertas = 0;
    }

    public void incrementar(int p) {
        puertas += p;
    }

    public int obtenerPuertas() {
        return puertas;
    }

    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.incrementar(1);
        System.out.println("La cantidad de puertas del auto es: " + miCoche.obtenerPuertas());
    }
}
