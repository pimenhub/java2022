package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmMostrar;


public class ControladorMostrar implements ActionListener, WindowListener, MouseListener{

    FrmMostrar vMo = new FrmMostrar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorMostrar(FrmMostrar vMo, PaisVO pvo, PaisDAO pdao) {
        this.vMo = vMo;
        this.pvo = pvo;
        this.pdao = pdao;
        
        vMo.btnCancelar.addActionListener(this);
        vMo.lblReporte.addMouseListener(this);
        vMo.addWindowListener(this);
    }
    
    private void mostrar(){
        DefaultTableModel m = new DefaultTableModel(){
        @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        m.setColumnCount(0);
        m.addColumn("Id del País");
        m.addColumn("Nombre del País");
        m.addColumn("Capital del País");
        m.addColumn("Población del País");
        
        for(PaisVO pvo : pdao.consultar()){
            m.addRow(new Object[]{pvo.getIdPais(), pvo.getNombrePais(),
            pvo.getCapitalPais(), pvo.getPoblacionPais()});
        }
        
        vMo.tblMostrar.setModel(m);
//        TableColumn cCero = vMo.tblMostrar.getColumnModel().getColumn(0);
//        cCero.setMaxWidth(75);
//        cCero.setMinWidth(75);
//        TableColumn cUno = vMo.tblMostrar.getColumnModel().getColumn(1);
//        cUno.setMaxWidth(150);
//        cUno.setMinWidth(150);
        
    }
    private void reporte(){
        pdao.reporte();
        pdao.jv.setDefaultCloseOperation(vMo.DISPOSE_ON_CLOSE);
        pdao.jv.setVisible(true);
    }
     
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == vMo.btnCancelar){
             vMo.dispose();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        this.mostrar();
    }

    @Override
    public void windowClosing(WindowEvent e) {
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
        this.mostrar();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == vMo.lblReporte){
            if(e.getClickCount() == 2){
                this.reporte();
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
