package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Extras;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmActualizar;

public class ControladorActualizar implements ActionListener, MouseListener, WindowListener {

    FrmActualizar vAc = new FrmActualizar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorActualizar(FrmActualizar vAc, PaisVO pvo, PaisDAO pdao) {
        this.vAc = vAc;
        this.pvo = pvo;
        this.pdao = pdao;

        vAc.btnActualizarPais.addActionListener(this);
        vAc.addWindowListener(this);
        vAc.tblActualizar.addMouseListener(this);

    }

    private void mostrar() {
        DefaultTableModel m = new DefaultTableModel() {
            //Metodo para evitar que las celdas se editen
            //Esta metodo lo acabo de investigar....
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

        for (PaisVO pvo : pdao.consultar()) {
            m.addRow(new Object[]{pvo.getIdPais(), pvo.getNombrePais(),
                pvo.getCapitalPais(), pvo.getPoblacionPais()});
        }
        vAc.tblActualizar.setModel(m);
    }

    private void setDatosPais() {
        //aplicacion del getSelectedRow
        int numRow;
        numRow = vAc.tblActualizar.getSelectedRow();
        vAc.txtIdPais.setText(String.valueOf(vAc.tblActualizar.getValueAt(numRow, 0)));
        vAc.txtNombrePais.setText(String.valueOf(vAc.tblActualizar.getValueAt(numRow, 1)));
        vAc.txtCapitalPais.setText(String.valueOf(vAc.tblActualizar.getValueAt(numRow, 2)));
        vAc.txtPoblacionPais.setText(String.valueOf(vAc.tblActualizar.getValueAt(numRow, 3)));
        //Agrego directamente la fecha de actualizacion
        pvo.setFechaActPais(Extras.fechaHoy());
    }

    private void actualizar() {
        pvo.setIdPais(Integer.parseInt(vAc.txtIdPais.getText()));
        pvo.setNombrePais(vAc.txtNombrePais.getText());
        pvo.setCapitalPais(vAc.txtCapitalPais.getText());
        pvo.setPoblacionPais(Long.parseLong(vAc.txtPoblacionPais.getText()));
        pvo.getFechaActPais();
        if (pdao.actualizar(pvo) == true) {
            vAc.jopActualizar.showMessageDialog(vAc, "Datos actualizados correctamente");
            vAc.txtIdPais.setText("");
            vAc.txtNombrePais.setText("");
            vAc.txtCapitalPais.setText("");
            vAc.txtPoblacionPais.setText("");
        } else {
            vAc.jopActualizar.showMessageDialog(vAc, "Error, Datos no actualizados");
            vAc.txtIdPais.setText("");
            vAc.txtNombrePais.setText("");
            vAc.txtCapitalPais.setText("");
            vAc.txtPoblacionPais.setText("");
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vAc.btnActualizarPais)) {
            if (!vAc.txtIdPais.getText().equals("")) {
                this.actualizar();
                this.mostrar();
            } else {
                vAc.jopActualizar.showMessageDialog(vAc, "Debe de elegir un País para Actualizar");
            }
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getClickCount() == 2) {
            this.setDatosPais();
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

    @Override
    public void windowOpened(WindowEvent e) {
        this.mostrar();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        vAc.txtIdPais.setText("");
        vAc.txtNombrePais.setText("");
        vAc.txtCapitalPais.setText("");
        vAc.txtPoblacionPais.setText("");
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

}
