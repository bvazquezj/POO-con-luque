import java.util.Date;

public class Fecha{
    
    public static void main(String[] args) {
       Date fecha = new Date();
        String[] dias = new String[]{"domingo","lunes","martes","miercoles","juevez"
                ,"viernes","sabado"};
        String[] mes = new String[]{"enero","febrero","marzo","abril","mayo",
                "junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

        System.out.println("Hoy es " +dias[fecha.getDay()]+", "+fecha.getDate()+
                " de "+mes[fecha.getMonth()]+" "+(fecha.getYear()+1900));
    }
}