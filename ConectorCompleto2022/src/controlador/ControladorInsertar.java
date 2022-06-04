package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Date;
import modelo.Extras;
import modelo.PaisDAO;
import modelo.PaisVO;
import vista.FrmInsertar;

public class ControladorInsertar implements ActionListener, WindowListener {

    FrmInsertar vIn = new FrmInsertar();
    PaisVO pvo = new PaisVO();
    PaisDAO pdao = new PaisDAO();

    public ControladorInsertar(FrmInsertar vIn, PaisVO pvo, PaisDAO pdao) {
        this.vIn = vIn;
        this.pvo = pvo;
        this.pdao = pdao;

        vIn.btnRegistrarPais.addActionListener(this);
        vIn.btnCancelarRegistro.addActionListener(this);

    }

    private void registrarPais() {
        this.pvo.setNombrePais(this.vIn.txtNombrePais.getText());
        this.pvo.setCapitalPais(this.vIn.txtCapitalPais.getText());
        this.pvo.setPoblacionPais(Long.parseLong(this.vIn.txtPoblacionPais.getText()));
        this.pvo.setFechaIngPais(Extras.fechaHoy());

        if (pdao.insertar(pvo) == true) {
            vIn.jopMensaje.showMessageDialog(vIn, "Datos Registrados Correctamente");
            this.vIn.txtNombrePais.setText("");
            this.vIn.txtCapitalPais.setText("");
            this.vIn.txtPoblacionPais.setText("");
        } else {
            vIn.jopMensaje.showMessageDialog(vIn, "Error, Datos no Registrados");
            this.vIn.txtNombrePais.setText("");
            this.vIn.txtCapitalPais.setText("");
            this.vIn.txtPoblacionPais.setText("");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vIn.btnRegistrarPais) {
            if (!this.vIn.txtNombrePais.getText().equals("")
                    && !this.vIn.txtCapitalPais.getText().equals("")
                    && !this.vIn.txtPoblacionPais.getText().equals("")) {
                this.registrarPais();
            } else {
                this.vIn.jopMensaje.showMessageDialog(vIn, "Debe de llenar todos los campos");
            }
        }
        if (e.getSource() == vIn.btnCancelarRegistro) {
            vIn.dispose();
        }

    }

    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.vIn.txtNombrePais.setText("");
        this.vIn.txtCapitalPais.setText("");
        this.vIn.txtPoblacionPais.setText("");
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
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }

}
