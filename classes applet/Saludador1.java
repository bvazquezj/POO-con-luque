// Fernando Luque M.
// se compila normalmente, se ejecuta con el comando		Appletviewer Saludador.html
// Diferente saludo segun la hora
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;		// el import no es recursivo
import java.util.*;

public class Saludador1 extends Applet implements ActionListener {
	Button btnOK;
	TextField tfmensaje;

	public void init()	{
		System.out.println("entro al metodo init");
		btnOK = new Button("Saludar");		// instanciar componentes
		tfmensaje = new TextField(10) ;
		btnOK.addActionListener(this);		// registra al applet en el btnOK
		add(btnOK);
		add(tfmensaje);
	}
	
	public void actionPerformed(ActionEvent e) {	// necesario para ser ActionListener 
		String saludo;			// local
		Date d= new Date();		// trae la fecha y hora actuales
		if(d.getHours() < 12)
			saludo = "Buenos dias";
		else
			if(d.getHours() < 19)
				saludo = "Buenas tardes";
			else
				saludo = "Buenas noches";
		tfmensaje.setText(saludo);
	}
}	// clase
