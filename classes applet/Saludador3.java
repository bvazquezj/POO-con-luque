// Diferente saludo segun la hora
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;		// el import no es recursivo
import java.util.*;


public class Saludador3 extends Applet implements ActionListener,MouseListener,MouseMotionListener,FocusListener{
	private Button btnOK,btnOK1;
	TextField tfmensaje,tfnombre;
        Label lblnom;

        @Override
	public void init() {
		System.out.println("entro al metodo init");
                addMouseMotionListener(this);
                
                btnOK = new Button("Saludar");		// instanciar componentes
                btnOK1 = new Button("limpiar");
		tfmensaje = new TextField(30);
                //tfmensaje.setEditable(false);
                tfmensaje.setCursor(null);
                tfmensaje.setFocusable(false);  
                lblnom = new Label("Introduce tu nombre");
                tfnombre = new TextField(15);
                tfnombre.addFocusListener(this);
                
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
			if(d.getHours() < 19){
				saludo = "!Buenas tardes¡";
                }else{
				saludo = "!Buenas noches¡";
                }
                if (tfnombre.getText().equals("")) {                    
                    tfnombre.requestFocus();
                    showStatus("introduce tu nombre");
                }else{
                    tfmensaje.setText(saludo+" "+nombre+":p");
                }
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
            btnOK.setBackground(Color.RED);
            btnOK.repaint();
        }else if (e.getSource()==btnOK1){
            showStatus("Este boton limpia");
            btnOK1.setBackground(Color.RED);
            btnOK1.repaint();
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        showStatus("Bienvenido.");
        if (e.getSource()==btnOK) {
            btnOK.setBackground(Color.WHITE);
        btnOK.repaint();
        }else if (e.getSource()==btnOK1) {
            btnOK1.setBackground(Color.WHITE);
            btnOK1.repaint();
        }
    }

    @Override
    public void mouseDragged(MouseEvent e) {
    }
    
    @Override
    public void mouseMoved(MouseEvent e) {
        showStatus(getMousePosition().toString().substring(14)); 
    }
    
    @Override
    public void focusGained(FocusEvent e) { 
    }
    
    @Override
    public void focusLost(FocusEvent e) {
        if (e.getSource()==tfnombre) {
            if("".equals(tfnombre.getText())){
                System.out.println("campo vacio");
                showStatus("campo vacio");
                tfnombre.requestFocus();
            }   
        }
    }    
}	// clase
