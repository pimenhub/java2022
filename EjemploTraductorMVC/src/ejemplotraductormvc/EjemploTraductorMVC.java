package ejemplotraductormvc;

import controlador.Controlador;
import modelo.Modelo;
import vista.FrmTraductor;

public class EjemploTraductorMVC {

    public static void main(String[] args) {
        FrmTraductor ft = new FrmTraductor();
        Modelo m = new Modelo();
        Controlador c = new Controlador(ft, m);
        
        ft.setVisible(true);
        ft.setLocationRelativeTo(null);
        
        
    }
    
}
