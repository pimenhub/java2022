package com.jpimentel.pg;

import java.io.*;

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
            //fw = new FileWriter("C:\\Users\\Jonathan Pimentel\\Desktop\\Ejemplo\\Ejemplo.txt",true);//Cuando no se desea sobreescribir la informacion del archivo
            pw = new PrintWriter(fw);

            pw.println("Esta es una prueba de escritura para el archivo recien creado");
            for (int i = 0; i <= 10; i++){
                pw.println("Linea "+i);
            }
            pw.println("Hola como estan");
            fw.close();
        }catch (Exception e){
            System.err.println("Error en el archivo por "+e);
        }
        //Lectura
        //File - encontrar un archivo en una ruta indicada
        File f;
        //FileReader - valida el archivo encontrado por file y lo apertura
        FileReader fr;
        //BufferedReader - lee la informacion completa del archivo hasta su tope vacio
        BufferedReader br;
        try {
            f = new File("C:\\Users\\Jonathan Pimentel\\Desktop\\Ejemplo\\Ejemplo.txt");
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String lineas;
            while ((lineas = br.readLine()) != null){
                System.out.println(lineas);
            }
        }catch (Exception e){
            System.err.println("Mensaje "+e+" */*");
        }
    }
}
