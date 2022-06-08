package animal;
 
public class Animal{
    private char sexo;
	float peso;	// por default = package
	protected int edad;
    public char getSexo(){
        return sexo;
    }
    public void respirar(){
        System.out.println("Animal: Todos los animales respiran");
    }
        
    public static void main(String[] args) {
        Animal []arr=new Animal[3];
        Animal ani=new Animal();
        arr[0]=ani;
        Pez salmon = new Pez();
        arr[1]=salmon;
        Ave piolin = new Ave();
        arr[2]=piolin ;
        for (int i = 0; i < 3; i++) {
            arr[i].respirar();
        }
    }
}

class Ave extends Animal{
    public String plumas;
	void cantar() {		// default
		System.out.println("el ave canta aunque la rama tiemble...");
	}
    @Override
        public void respirar(){
            System.out.println("Ave: las aves respiran aire");
        }
}
class Pez extends Animal{	// no es public, por default = package
	private String escamas;
	int branquias;	// por default = package
        @Override
        public void respirar(){
            System.out.println("Pez: Los peces respiran por las branqueas");
        }
}
