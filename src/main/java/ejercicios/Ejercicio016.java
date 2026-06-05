package ejercicios;

public class Ejercicio016 {
	
	//COMPLETAR METODO
	public boolean esPar(int n) {
		return n % 2 == 0;
    }

    public static void main(String[] args) {
    	Ejercicio016 ejercicio016 = new Ejercicio016();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("¿Es par? " + ejercicio016.esPar(numero));
        
        scanner.close();
    }
}
