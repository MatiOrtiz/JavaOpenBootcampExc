package Exc1Java;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        int intValue= 5;
        long variableLong= 4;
        double variableDouble= 34;
        boolean variableBoolean= true;
        String variableStr= ("Hola Mundo");

        String[] arrayNombres= new String[]{"Matias", "Juan", "Ivan"};

        List<Integer> listaEnteros= new ArrayList<>();
        listaEnteros.add(21);
        listaEnteros.add(34);

        Map<String, String> autos= new HashMap<>();
        autos.put("Honda", "rojo");
        autos.put("Chevrolet", "azul");
        autos.put("Fiat", "blanco");

        System.out.println("EL tipo de dato entero es: " + intValue);
        System.out.println("EL tipo de dato long es: " + variableLong);
        System.out.println("EL tipo de dato double es: " + variableDouble);
        System.out.println("EL tipo de dato booleano es: " + variableBoolean);
        System.out.println("EL tipo de dato string es: " + variableStr);

        System.out.println("El tipo de dato array es: ");
        for(int i=0; i<arrayNombres.length; i++)
                System.out.println(arrayNombres[i]);

        System.out.println("El tipo de dato lista es: ");
        for(int valoresInt: listaEnteros)
            System.out.println(valoresInt);

        System.out.println("El tipo de dato Mapa es: ");
        for (Map.Entry<String, String> pair: autos.entrySet())
            System.out.println(pair.getKey() + " / " + pair.getValue());
    }
}
