package com.jpimentel.pg;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Map
        //HashMap
        Map<Integer, String> mapH = new HashMap<>();
        mapH.put(101,"Motor");
        mapH.put(106,"Llantas");
        mapH.put(103,"Carroceria");
        mapH.put(109,"Bateria");
        mapH.put(105,"Transmision");

        //Tamanio de Map
        System.out.println(mapH.size());
        //Si esta vacio
        System.out.println(mapH.isEmpty());
        //Muestra el valor que tiene asignada la clave
        System.out.println(mapH.get(109));
        System.out.println(mapH.get(110));
        //Limpiar el map
        //mapH.clear();
        //remueve tanto clave como valor
        System.out.println(mapH.remove(105));
        //Valida si la clave existe en el map
        System.out.println(mapH.containsKey(106));
        System.out.println(mapH.containsKey(111));
        //Valida si el valor existe en el map
        System.out.println(mapH.containsValue("Motor"));
        System.out.println(mapH.containsValue("Suspension"));
        //Muestra en una coleccion los valores del map
        System.out.println(mapH.values());
        //Recorrer el Map
        System.out.println("Recorrido 1");
        for (Map.Entry<Integer, String> mapHR: mapH.entrySet()) {
            Integer key = mapHR.getKey();
            String value = mapHR.getValue();
            System.out.println(key + " --- "+value);
        }
        System.out.println("-----------------------**************---------------------");

        //TreeMap
        Map<String, String> mapT = new TreeMap<>();
        mapT.put("P1", "Motherboard");
        mapT.put("P7", "SSD");
        mapT.put("P3", "Memoria RAM");
        mapT.put("P9", "Fuente de Poder");
        mapT.put("P5", "Procesador");

        //Tamanio del Map
        System.out.println(mapT.size());
        //Si esta vacio
        System.out.println(!mapT.isEmpty());
        //Muestra el valor que tiene asignada la clave
        System.out.println(mapT.get("P7"));
        System.out.println(mapT.get("P50"));
        //Limpiar map
        //mapT.clear();
        //remueve tanto clave como valor
        System.out.println(mapT.remove("P1"));
        System.out.println(mapT.remove("P100"));
        //Valida si la clave existe en el map
        System.out.println(mapT.containsKey("P3"));
        System.out.println(mapT.containsKey("P30"));
        //Valida si el valor existe en el map
        System.out.println(mapT.containsValue("Procesador"));
        System.out.println(mapT.containsValue("Teclado"));
        //Muestra en una coleccion los valores del map
        System.out.println(mapT.values());
        //Recorrer el Map
        System.out.println("Recorrido 2");
        for (Map.Entry<String, String> mapTR : mapT.entrySet()) {
            String key = mapTR.getKey();
            String value = mapTR.getValue();
            System.out.println(key +" --- "+value);
        }
    }
}
