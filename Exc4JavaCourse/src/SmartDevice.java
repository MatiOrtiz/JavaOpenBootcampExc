public class SmartDevice {
    protected String color;
    protected float bateria;
    protected float brillo;
    protected double tamanio;

    public SmartDevice(String color, float bateria, float brillo, double tamanio){
        this.color= color;
        this.bateria= bateria;
        this.brillo= brillo;
        this.tamanio= tamanio;
    }
    public String toString(){
        return ("Color:" + color + " Batería:" + bateria + " Brillo:" + brillo + " Tamaño:" + tamanio);
    }
}
