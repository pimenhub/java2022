package com.jpimentel.pg;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.IllegalFormatException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Expo 1
        //Calendar c1 = Calendar.getInstance();
        /*Calendar c1 = GregorianCalendar.getInstance();
        System.out.println("Fecha actual: "+c1.getTime());
        c1.set(2000, Calendar.AUGUST, 31);
        System.out.println("Fecha 31 Agosto 2000: "+c1.getTime());
        c1.set(Calendar.MONTH,1);
        System.out.println("Fecha 2 meses mas: "+c1.getTime());

        c1.add(Calendar.MONTH, 5);
        System.out.println("Fecha 13 meses mas: "+c1.getTime());
        c1.roll(Calendar.HOUR, 25);
        System.out.println("Fecha 25 horas mas: "+c1.getTime());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMMMM/yyyy hh:mm:ss");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MMM/yyyy");
        System.out.println("Fecha Formateada "+simpleDateFormat.format(c1.getTime()));

        Calendar fecha = Calendar.getInstance();
        fecha.set(Calendar.DATE, 1);
        fecha.set(Calendar.MONTH,0);
        fecha.set(Calendar.YEAR,2022);
        System.out.println("--- "+simpleDateFormat1.format(fecha.getTime()));

        int dia = fecha.get(Calendar.DATE);
        int mes = fecha.get(Calendar.MONTH)+1;
        int anio = fecha.get(Calendar.YEAR);
        System.out.println(dia+"/"+mes+"/"+anio);*/

        //Expo 2
        try {
            int[] n = new int[4];
            n[0] = 1;
            n[1] = 1;
            n[2] = 1;
            n[3] = 1;
            System.out.println(n[4]);
        }catch (Exception e){
            System.err.println("Posicion fuera de rango "+e.getMessage());
            System.err.println("Posicion fuera de rango "+e);
        }





    }
}
