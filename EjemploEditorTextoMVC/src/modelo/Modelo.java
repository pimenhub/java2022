package modelo;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Modelo {

    private String texto;
    private String ruta;
    
    public Modelo() {
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public void guardar(){
        FileWriter fw;
        PrintWriter pw;
        try{
            fw = new FileWriter(this.ruta+".txt");
            pw = new PrintWriter(fw);
            pw.println(this.texto);
            fw.close();
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
    
//    public void abrir(){
//        File f;
//        FileReader fr;
//        BufferedReader br;
//        this.texto = "";
//        try{
//            f = new File(this.ruta);
//            fr = new FileReader(f);
//            br = new BufferedReader(fr);
//            
//            String lineas;
//            while((lineas = br.readLine())!= null){
//                this.texto += lineas;
//            }
//            
//        }catch(Exception ex){
//            System.err.println(ex.getMessage());
//        }
//    }
    
    public String abrir(){
        File f;
        FileReader fr;
        BufferedReader br;
        String t = "";
        try{
            f = new File(this.ruta);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            
            String lineas;
            while((lineas = br.readLine())!= null){
                t += lineas+"\n";
            }
            
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
        return t;
    }
    
    public Font negrita(){
        Font f = new Font("", Font.BOLD, 12);
        return f;       
    }
    
}
