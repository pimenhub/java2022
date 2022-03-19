package com.jpimentel.edc;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Definicion del array list
        //crear el objeto ArrayList
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Double> arrayList2;

        //Conocer el numero de elementos del AL
        System.out.println(arrayList.size());

        //Agregar elemento al AL
        arrayList.add("Perro");
        arrayList.add("Gato");
        arrayList.add("Hamster");
        arrayList.add("Tortuga");
        arrayList.add("Tortuga");
        arrayList.add("Leon");
        System.out.println(arrayList.size());
        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(300);
        System.out.println(arrayList1.size());
        //Se inicializa el AL hasta en el momento en que se va a utilizar
        arrayList2 = new ArrayList<>();
        arrayList2.add(1.5);
        arrayList2.add(1.7);
        arrayList2.add(1.9);
        arrayList2.add(1.8);
        arrayList2.add(1.6);
        System.out.println(arrayList2.size());
        //Agregar elemente al AL por posicion
        arrayList.add(0,"Loro");
        arrayList.add(4,"Conejo");
        arrayList.add(5,"Canario");

        arrayList.add(0,"Rana");

        //Elimina el elemento de la posicion indicada
        arrayList.remove(0);
        arrayList.remove(2);

        //Elimina la primera ocurrecia del elemento en el AL
        System.out.println(arrayList.remove("Tortuga"));
        System.out.println(arrayList.remove("Canario"));
        System.out.println(arrayList2.remove(1.8));

        //Limpia  todos los elementos que contiene el AL
        arrayList1.clear();
        System.out.println(arrayList1.size());
        System.out.println(arrayList1.isEmpty());
        //Sustituir elemento del AL
        arrayList.set(0,"Jifara");
        arrayList.set(1,"Leon");

        //Comprobar que el elemento existe en el AL
        System.out.println(arrayList.contains("Leo"));
        //Conocer la posicion del elemento en el AL
        System.out.println(arrayList.indexOf("Conejo"));
        System.out.println(arrayList2.indexOf(1.8));
        System.out.println(arrayList.indexOf("Leon")+"-------");
        System.out.println(arrayList.lastIndexOf("Leon")+"-------");
        System.out.println(arrayList2.isEmpty());
        //Mostrar elemento en la posicion indicada
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));
        System.out.println("---------------------------------------------");
        for (String s: arrayList) {
            System.out.println(s);
        }
        System.out.println("---------------------------------------------");
        arrayList2.remove(1.7);
        for (int i = 0; i < arrayList2.size(); i++){
            System.out.println("["+i+"] "+arrayList2.get(i));
        }

    }
}
