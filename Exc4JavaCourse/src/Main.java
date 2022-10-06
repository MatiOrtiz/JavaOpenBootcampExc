public class Main {
    public static void main(String[] args) {

        SmartDevice device= new SmartDevice("gris", 3000, 1000, 6.5);
        SmartPhone phone= new SmartPhone("azul", 5000, 1000, 6.6, 3, 40);
        SmartWatch watch= new SmartWatch("negro", 1200, 700, 1.4, true, true);


        System.out.println("The device's values are: " + device.toString());
        System.out.println("The phone's values are: " + phone.toString());
        System.out.println("The watch's values are: " + watch.toString());
    }
}