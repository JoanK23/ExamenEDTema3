import java.util.Scanner;

/**
*@Version v1.0
*@author Miquel
*@see Google
*@since 2023
*/

public class FuncionSuma {

	
	
	private static int primerSumando;
	
	private static int segundoSumando; 

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Introduce el primer sumando:");
		primerSumando = in.nextInt();
		in.nextLine();
		System.out.println("Introduce el segundo sumando:");
		segundoSumando = in.nextInt();
		in.nextLine();
		System.out.println("La suma es: " + suma(primerSumando, segundoSumando));
		
		in.close();

	}
	
	/**
	*@param sumando1 primer nombre a sumar
	*@param sumando2 segon nombre a sumar
	*@return es la suma de sumando1 i sumando2
	
	private static int suma (int sumando1, int sumando2) {
		return sumando1+sumando2;
	}

}
