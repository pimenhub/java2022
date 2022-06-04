package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmEliminar;


public class ControladorEliminar implements WindowListener, MouseListener{

    FrmEliminar vEl = new FrmEliminar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorEliminar(FrmEliminar vEl, PaisVO pvo, PaisDAO pdao) {
        this.vEl = vEl;
        this.pvo = pvo;
        this.pdao = pdao;
        
        vEl.addWindowListener(this);
        vEl.tblEliminar.addMouseListener(this);
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
        vEl.tblEliminar.setModel(m);
    }
    
    private void setDatoEliminar(){
        int numRow;
        numRow = vEl.tblEliminar.getSelectedRow();
        pvo.setIdPais(Integer.parseInt(String.valueOf(vEl.tblEliminar.getValueAt(numRow, 0))));
        int idPais = vEl.jopEliminar.showConfirmDialog(vEl,
                "En verdad desea eliminar el País de "+vEl.tblEliminar.getValueAt(numRow, 1), "Eliminar", 2);
        if(idPais == vEl.jopEliminar.OK_OPTION){
            this.eliminar();
            vEl.jopEliminar.showMessageDialog(vEl, "Dato Eliminado Correctamente");
        }
    }
    
    private void eliminar(){
        pvo.getIdPais();
        pdao.eliminar(pvo);
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
        if(e.getClickCount() == 2){
            this.setDatoEliminar();
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
