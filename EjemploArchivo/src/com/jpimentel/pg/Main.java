package com.jpimentel.pg;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Escritura y lectura de un archivo .txt
        //Escritura

        //FileWrite - crea un archivo en una ruta indicada y lo apertura
        FileWriter fw;

        //PrintWrite - permite agregar informacion a un archivo aperturado
        PrintWriter pw;

        try {
            fw = new FileWriter("C:\\Users\\Jonathan Pimentel\\Desktop\\Ejemplo\\Ejemplo.txt");
            pw = new PrintWriter(fw);

            pw.println("Esta es una prueba de escritura para el archivo recien creado");
            for (int i = 0; i <= 30; i++){
                pw.println("Linea "+i);
            }
            fw.close();
        }catch (Exception e){
            System.err.println("Error en el archivo por "+e);
        }


    }
}
