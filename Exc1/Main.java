public class Main {
    public static void main(String[] args) {
        int resultado;
        resultado = suma(2, 24, 4);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.incrementar(1);
        System.out.println("La cantidad de puertas del auto es: " + miCoche.obtenerPuertas());
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
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
}