import java.util.Scanner;
import java.util.Locale;;

public class Exercicio {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		final var ponto = new Locale("en", "us");

		
		
		
		
		
	/*	
	 Exercício 1*/
		int number1 = 0;
		 int resultado1 = number1 % 4;
		
	    System.out.print("Entre com algum ano para saber se ele é bissexto ou não: ");
		number1 = leia.useLocale(ponto) .nextInt();
		
		if(number1 % 4 ==0) {
			System.out.println("É um ano bissexto");
		}else {
		System.out.println("Não é um ano bissexto");
		}
		
		/*
		 Exercício 2
		*/
		
        int number2 = 0;
        int resultado2 = number2 % 2;
       
        System.out.print("Me informe um numero: ");
        number2 = leia.useLocale(ponto) .nextInt();
        
        if(number2 % 2 ==0) {
        	System.out.println("Número é par");
        }else { 
        	System.out.println("Número é impar"); 
        
		int number3 = 0;
	    int numberr3 = 0;
	 System.out.println("Me informe um número: ");
		number3 = leia.useLocale(ponto) .nextInt();
		System.out.println("Me informe outro número: ");
		if (number3 > numberr3)
		System.out.println("Maior que" ); 
        }

		double media;
		double bimestre1;
		double bimestre2;
		double bimestre3;
		double bimestre4;
	System.out.println("Entre com a primeira nota do bimestre: ");
		bimestre1 = leia.nextDouble();
		System.out.println("Entre com a segunda nota do bimestre: ");
		bimestre2 = leia.nextDouble();
		System.out.println("Entre com a terceira nota do bimestre: ");
		bimestre3 = leia.nextDouble();
		System.out.println("Entre com a quarta nota do bimestre: ");
		bimestre4 = leia.nextDouble();
		
		media = (bimestre1 + bimestre2 + bimestre3 + bimestre4) / 4 ;
        System.out.printf("A média foi: " + media);
        
        	
        
		
	
	
	        
			
		
		leia.close();
	}

}
