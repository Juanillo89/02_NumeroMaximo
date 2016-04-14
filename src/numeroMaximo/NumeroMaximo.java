package numeroMaximo;

import java.util.Scanner;

public class NumeroMaximo
{	
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int maximo = 0;
		int num;
		int contadorValidos = 0;
		int contadorNoValidos = 0;
		while(contadorValidos != 11)
		{	
			System.out.print("Introduce n�mero entero comprendido entre el 20 y el 40, ambos inclusive: ");
			num = sc.nextInt();
			if(num <= 40 && num >= 20)
			{
				contadorValidos++;
				if(num > maximo)
				{
					maximo = num;
				}
			}
			else
			{
				System.out.println("Dato err�neo.");
				contadorNoValidos++;
			}
			System.out.println("El m�ximo valor v�lido introducido es " + maximo + " y se han introducido " + contadorNoValidos + " datos err�neos.");
		}
		sc.close();
	}
}
