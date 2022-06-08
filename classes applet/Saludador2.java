// Diferente saludo segun la hora
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;		// el import no es recursivo
import java.util.*;

public class Saludador2 extends Applet implements ActionListener,MouseListener{
	Button btnOK,btnOK1;
	TextField tfmensaje,tfnombre;
        Label lblnom;

        @Override
	public void init()	{
		System.out.println("entro al metodo init");
                showStatus("Bienvenido");
		btnOK = new Button("Saludar");		// instanciar componentes
                btnOK1 = new Button("limpiar");
		tfmensaje = new TextField(30);
                //tfmensaje.setEditable(false);
                tfmensaje.setCursor(null);
                tfmensaje.setFocusable(false);
                tfnombre = new TextField(15);
                lblnom = new Label("Introduce tu nombre");
		btnOK.addActionListener(this);		// registra al applet en el btnOK
                btnOK.addMouseListener(this);
                btnOK1.addActionListener(this);
                btnOK1.addMouseListener(this);
		
                
                add(lblnom);
                add(tfnombre);
                add(btnOK);
		add(tfmensaje);
                add(btnOK1);
		
	}
	
        @Override
	public void actionPerformed(ActionEvent e) {	// necesario para ser ActionListener
            if (e.getSource()==btnOK) {
                String saludo,nombre;			// local
                nombre=tfnombre.getText();
		Date d= new Date();		// trae la fecha y hora actuales
		if(d.getHours() < 12)
			saludo = "!Buenos dias¡";
		else
			if(d.getHours() < 19)
				saludo = "!Buenas tardes¡";
			else
				saludo = "!Buenas noches¡";
		tfmensaje.setText(saludo+" "+nombre+":p");
            }else if(e.getSource()== btnOK1){
                tfmensaje.setText("");
                tfnombre.setText("");
            }
	}

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (e.getSource()==btnOK) {
            showStatus("Este boton saluda");
        }else if (e.getSource()==btnOK1){
            showStatus("Este boton limpia");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        showStatus("Bienvenido.");
    }
        
}	// clase
