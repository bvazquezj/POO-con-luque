import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class Persigue extends Applet implements ActionListener,MouseMotionListener{

    Label lbl1;
    Button btn1, btn2;
    int cont=0;
    
    @Override
    public void init() {
        cont=0;
        removeAll();
        lbl1 = new Label("Quieres ser mi novia?");
        lbl1.setVisible(true);
        btn1 = new Button("No");
        btn1.addMouseMotionListener(this);
        btn1.setVisible(true);
        btn2 = new Button("Si");
        btn2.addActionListener(this);
        btn2.setVisible(true);
        
        add(lbl1);
        add(btn1);
        add(btn2);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        lbl1.setText("Ya sabia que si querias");
        remove(btn1);
        remove(btn2);
        showStatus("FELICIDADES");
    }
    @Override
    public void mouseMoved(MouseEvent e){
        int x,y;
        if ((e.getSource()==btn1)&&(cont<50)) {              
                x=(int) (Math.random()*275);
                y=(int) (Math.random()*175+10);
                btn1.setLocation(x, y);
                cont++;
                System.out.println(cont);
        }else{
                remove(btn1);
        }
    }
    
    @Override
    public void mouseDragged(MouseEvent e){
        
    }
}


