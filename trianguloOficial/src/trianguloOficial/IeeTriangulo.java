package trianguloOficial;

import java.util.Scanner;

public class IeeTriangulo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		double a,b,c;
		
		System.out.print("Digite o valor do 1º lado do triângulo: ");
		a = leitor.nextDouble();
		
		System.out.print("Digite o valor do 2º lado do triângulo: ");
		b = leitor.nextDouble();
		
		System.out.print("Digite o valor do 3º lado do triângulo: ");
		c = leitor.nextDouble();
		
		leitor.close();
		
		if (a + b > c && b + c > a && c + a > b) { 
			
		  if (a == b && a == c && b == c) {
			System.out.println("As medidas fornecidas formam um triângulo equilátero!!!");
		} else if (a != b && a != c && b != c) {
			System.out.println("As medidas fornecidas formam um triângulo escaleno!!!");
		} else  System.out.println("As medidas fornecidas formam um triângulo isósceles!!!");
		
		} else System.out.println("As medidas fornecidas não caracterizem um triângulo!!!");
				 


	}

}
