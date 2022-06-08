
import java.util.Date;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class Saludadory extends Applet implements ActionListener{
     Button btnOk;
     TextField tfmensaje;
     String saludo;
     
     @Override
     public void init(){
         System.out.println("entro al metodo init");
         btnOk = new Button("Saludar");
         tfmensaje = new TextField(15);
         btnOk.addActionListener(this);
         add(btnOk);
         add(tfmensaje);
     }
    public String saludo(){
         int num;
         Date time = new Date();
         num = time.getHours();
         System.out.println(num);
         if(0<=num&&num<12){
             return "Buenos Dias";
             
         }else if (12<=num&&num<19) {
             return "Buenas tardes";
             
         }else if (19<=num&&num<24) {
             return "Buenas Noches";
         }else{
             return "Hola";
             
         } 
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         tfmensaje.setText(saludo());
    }
 }