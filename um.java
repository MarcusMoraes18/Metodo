import java.util.Scanner;
public class um {

	public static void main(String[] args) {
		//  Escreva um procedimento que receba por parâmetro dois números inteiros X e Y,
		//	calcule e mostre na tela a multiplicação do número X pelo Y. 
	
	
	
	int resultado = mult(5,10);
	
	System.out.println(resultado);
	}
		
	public static int mult(int x, int y) {
		Scanner num = new Scanner(System.in);
		
		System.out.println("digite um numero: ");
		x=num.nextInt();
		System.out.println("digite um numero: ");
		y=num.nextInt();
		System.out.println("Multiplicação");
		
	return x * y;	
		
	}

}
