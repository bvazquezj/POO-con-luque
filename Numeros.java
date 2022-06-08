public class Numeros{
    
    public static void main(String[] args) {
        // TODO code application logic here
        boolean a=true,b=false;
        int bol=24,eta=62;
        System.out.println("Realizar operaciones con cada uno de los operadores");
        System.out.println("operaciones con variables binarias");
        System.out.println(!a);
        System.out.println(a&&b);
        System.out.println(a&b);
        System.out.println(a||b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println("Operaciones con variables Int");
        System.out.println(~bol);
        System.out.println(bol&eta);
        System.out.println(bol|eta);
        System.out.println(bol^eta);   
        System.out.println(bol<<2);
        System.out.println(bol>>2);
        System.out.println(bol>>>2);
    }
}
