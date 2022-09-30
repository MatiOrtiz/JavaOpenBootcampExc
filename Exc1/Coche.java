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
        Coche c1 = new Coche(2);
        c1.incrementar(2);
        System.out.println("La cantidad de puertas del auto es: " + c1.obtenerPuertas());
    }
}
