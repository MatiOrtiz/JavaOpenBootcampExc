import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ingrese el precio: ");
        float precioMasIva= scanner.nextFloat();

        System.out.println("El precio mas iva es: " + precio(precioMasIva));
    }

    public static double precio(float p){
        return  (p + p*0.21);
    }
}