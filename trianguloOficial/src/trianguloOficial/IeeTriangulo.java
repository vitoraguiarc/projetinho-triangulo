package trianguloOficial;

import java.util.Scanner;

public class IeeTriangulo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		double a,b,c;
		
		System.out.print("Digite o valor do 1� lado do tri�ngulo: ");
		a = leitor.nextDouble();
		
		System.out.print("Digite o valor do 2� lado do tri�ngulo: ");
		b = leitor.nextDouble();
		
		System.out.print("Digite o valor do 3� lado do tri�ngulo: ");
		c = leitor.nextDouble();
		
		leitor.close();
		
		if (a + b > c && b + c > a && c + a > b) { 
			
		  if (a == b && a == c && b == c) {
			System.out.println("As medidas fornecidas formam um tri�ngulo equil�tero!!!");
		} else if (a != b && a != c && b != c) {
			System.out.println("As medidas fornecidas formam um tri�ngulo escaleno!!!");
		} else  System.out.println("As medidas fornecidas formam um tri�ngulo is�sceles!!!");
		
		} else System.out.println("As medidas fornecidas n�o caracterizem um tri�ngulo!!!");
				 


	}

}
