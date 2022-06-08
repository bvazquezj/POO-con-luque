public class Param{
    public static void main(String[] args) {
        if (args.length != 0) {
        	for (int i = 0; i < args.length; i++) {
            	String arg = args[i];
            	System.out.println((i+1)+".- "+args[i]);
        	}
        }else{
        	System.out.println("No se introdujeron parametros valor");
        }
    }
}