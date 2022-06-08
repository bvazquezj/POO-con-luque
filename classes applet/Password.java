import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class Password extends Applet implements ActionListener,MouseListener{

    TextField user,pass;
    Button ojito,btn2; 
    private String spass;
    @Override
    public void init() {
        user = new TextField(15);
        user.setVisible(true);
        pass = new TextField(10);
        pass.setEchoChar('*');
        pass.setVisible(true);
        ojito = new Button("ojo");
        ojito.addMouseListener(this);
        ojito.setVisible(true);
        btn2 = new Button("ingresar");
        btn2.addActionListener(this);
        btn2.setVisible(true);
        add(user);
        add(pass);
        add(ojito);
        add(btn2);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if ((e.getSource()==btn2)&&(!user.getText().isEmpty())&&(!pass.getText().isEmpty())) {
            showStatus("ingresando...");
        } else {
            showStatus("introduce tus datos");
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource()==ojito) {
            pass.setEchoChar((char)0);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (e.getSource()==ojito) {
            pass.setEchoChar('*');
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}