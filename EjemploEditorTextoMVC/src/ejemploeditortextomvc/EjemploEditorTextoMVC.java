package ejemploeditortextomvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.FrmAreaTexto;


public class EjemploEditorTextoMVC {


    public static void main(String[] args) {
        FrmAreaTexto v = new FrmAreaTexto();
        Modelo m = new Modelo();
        Controlador c = new Controlador(v, m);
        v.setVisible(true);
        v.setResizable(false);
        v.setLocationRelativeTo(null);
    }
    
}
