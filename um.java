import java.util.Scanner;
public class um {

	public static void main(String[] args) {
		//  Escreva um procedimento que receba por par�metro dois n�meros inteiros X e Y,
		//	calcule e mostre na tela a multiplica��o do n�mero X pelo Y. 
	
	
	
	int resultado = mult(5,10);
	
	System.out.println(resultado);
	}
		
	public static int mult(int x, int y) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		x=num.nextInt();
		System.out.println("digite um numero: ");
		y=num.nextInt();
		System.out.println("Multiplica��o");
		
	return x * y;	
		
	}

}
