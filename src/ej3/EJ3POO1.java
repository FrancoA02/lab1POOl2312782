package ej3;
import java.util.Scanner;

public class EJ3POO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		//Ejercicio 1
			
			if(6<6*5)
				System.out.print("Hello");
				System.out.print("There");
			
			//Resultado: HelloThere*
				
			
		//Ejercicio 2
			
			int x = 1, y = 2, z = 3;
			
			if (x>y)
			if (x>z) 
				System.out.println("1111");
			else 
				System.out.println("2222");
			
			//Resultado: No imprime nada
		
		//Ejercicio 3
			
			
			
			if(x < z)
				System.out.println("*");
			else if (x == z)
				System.out.println("&");
			else
				System.out.println("$");
			
			//Resultado: *	
			
		//Ejercicio 4
			
				
			
			if(x<y)
				System.out.println("####");
			else
				System.out.println("&&&&");
				System.out.println("****");
				
			//Resultado: ####
			//			 ****
				
		//Ejercicio 5
				
				
				
				if(x>y)
					System.out.println("####");
				else {
					System.out.println("&&&&");
					System.out.println("****");
				}
			//Resultado: &&&&
			//           ****
				
				
		//Ejercicio 6
				
				int a1 = 100; int a2 = 200;
				
				if(a1 > 100 && a2 <= 200)
					System.out.print(a1+" "+a2+" "+(a1+a2));
				else
					System.out.print(a1+" "+a2+" "+(2*a1-a2));
				
			//Resultado: 100 200 0
		
		//Ejercicio 7
				
				int numero1 = 1, numero2 = 2, numero3=3;
						
				if(++numero1 > numero2++ || numero1-- > 0)
					numero3++;
				else
					numero3--;
				System.out.println(numero1+" "+numero2+" "+numero3);
		
			//Resultado: 1 3 4
				
		//Ejercico 8
				
				
				
				if(x<y) {
					System.out.println("####");
					System.out.println("****");
				}
				else
					System.out.println("&&&&");
				
			//Resultado: ####
			//           ****
				
		//Ejercicio 9
				
				if('x'>'y'|| 66 > (int)('A'))
					System.out.println("#*#");
				
				//Resultado: #*#
		
		//Ejercicio 10
				
				if(x<z)
					System.out.println("*");
				else if (x==z)
					System.out.println("&");
				else
					System.out.println("$");
				
				//Resultado: *
				
		//Ejercicio 11
				
				System.out.print("Ingrese su numero: ");
				int numero = scanner.nextInt();
				
				if(numero % 2 != 0 && numero > 0) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
				
		//Ejercicio 12
					
					System.out.print("Ingrese su numero: ");
				int numA = scanner.nextInt();
				System.out.print("Ingrese su numero: ");
				int numB = scanner.nextInt();
		
				if (numA > 0 && numB > 0) {
					System.out.println("true");
				}else {
					System.out.println("false");
				}
		//Ejercicio 13
				
				System.out.print("Ingrese su numero: ");
				int semana = scanner.nextInt();
				
				switch(semana) {
				case 0:
					System.out.println("Lunes");
					break;
				case 1:
					System.out.println("Martes");
					break;
				case 2:
					System.out.println("Miercoles");
					break;
				case 3:
					System.out.println("Jueves");
					break;
				case 4:
					System.out.println("Viernes");
					break;
				case 6:
					System.out.println("Sabado");
					break;
				default:
					System.out.println("Domingo");
				
				}
		
	}

}
