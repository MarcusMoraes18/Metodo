import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int resultado = mult(0,0);	
		System.out.println(resultado);
	}
	
	
	public static int mult(int x, int y) {	
	Scanner BB = new Scanner(System.in);
	
	int soma = 0;
		
	System.out.println("digite um numero:");
	x=BB.nextInt();
	
	System.out.println("digite um numero:");
	y=BB.nextInt();
	
	for(int n=x; n<=y; n++) {
	
		if(n == 0)	
		continue; 
	soma += n;
	
	}
	return soma;
	
	}}
	
	
