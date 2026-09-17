package co.edu.uniquindio.poo.EjerciciosClase;

import java.util.*;

public class Conjuntos {

    static void main(){

        Set<String> conjunto = new HashSet<>();

        boolean agregado = conjunto.add("Juan");

        conjunto.add("Pedro");
        conjunto.add("Luis");
        conjunto.add("Maria");
        conjunto.add("Sandra");
        conjunto.add("Ruben");

        Iterator<String> iterator = conjunto.iterator();
        List<String> lista = new ArrayList<>(conjunto);

        Set<Cliente> conjunto1 = new HashSet<>();

        Cliente c1= new Cliente("Juan");
        Cliente c2= new Cliente("Juan");
        Cliente c3= new Cliente("Juan");
        Cliente c4= new Cliente("Juan");

        conjunto1.add(c1);
        conjunto1.add(c2);
        conjunto1.add(c3);
        conjunto1.add(c4);

        if(c1.equals(c2)){
            System.out.println("Son iguales");
        }else{
            System.out.println("Hola");
        }

        Set<String> conjunto2 = new LinkedHashSet<>();
        conjunto2.add("Juan");
        conjunto2.add("Pedro");
        conjunto2.add("Luis");
        conjunto2.add("Sandra");

        for (String aux : conjunto2) {
            System.out.println(aux);
        }

        System.out.println(conjunto1);
    }
}
