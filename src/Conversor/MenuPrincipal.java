package Conversor;
import java.util.Scanner;


public class MenuPrincipal{
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
				
	    int opcion = 0;
	    
	    do {
	    	System.out.println("El tipo de cambio usuado de las diferentes monedas se calculo en promedio...");
			System.out.println( );
	        System.out.println("1. Peso Mexicano --> Dolar             :...");
	        System.out.println("2. Peso Mexicano --> Euro              :...");
	        System.out.println("3. Peso Mexicano --> Libras Esterlinas :...");
	        System.out.println("4. Peso Mexicano --> Yen Japones       :...");
	        System.out.println("5. Peso Mexicano --> Won Sur Coreano   :...");
	        System.out.println("0. Salir :...");
	        
	        System.out.println("Selecciona una Opcion...");
	    	opcion = scanner.nextInt();
	    	 switch(opcion) {
	 	    case 1:
	 	    	dolar();
	 	    	break;
	 	    case 2:
	 	    	euro();
	 	    case 3:
	 	    	libraEsterlina();
	 	    	break;
	 	    case 4:
	 	    	yenJapones();
	 	    	break;
	 	    case 5:
	 	    	wonSurCoreano();
	 	    	break;
	 	    case 0:
	 	    	break;
	 	    	default: 
	 	    		System.out.println("Elije la opcion correcta...");
	 	    		System.out.println();
	 	    }
	    }while(opcion!=0);
	    System.out.println("Gracias por usar el convertidor de moneda de zashj... hasta pronto!!!");
	       
	        
		
	}
	static void dolar() {
		System.out.println("Cuantos Pesos Mexicanos quieres cambiar:...");
		double importe=scanner.nextInt();
		double dolar = 18.50;
		double tc;
		tc = importe / dolar;
		System.out.println("El Importe es: "+ tc + " Dolares");
	}
	static void euro() {
		System.out.println("Cuantos Pesos Mexicanos quieres cambiar:...");
		double importe=scanner.nextInt();
		double euro = 19.30;
		double tc;
		tc = importe / euro;
		System.out.println("El Importe es: "+ tc + " Euros");		
	}
	static void libraEsterlina() {
		System.out.println("Cuantos Pesos Mexicanos quieres cambiar:...");
		double importe=scanner.nextInt();
		double libraEsterlina = 22.50;
		double tc;
		tc = importe / libraEsterlina;
		System.out.println("El Importe es: "+ tc + " Libra Esterlina");
	}
	static void yenJapones() {
		System.out.println("Cuantos Pesos Mexicanos quieres cambiar:...");
		double importe=scanner.nextInt();
		double yenJapones = 0.50;
		double tc;
		tc = importe / yenJapones;
	System.out.println("El Importe es: "+ tc + " Yen Japones");
	}
	static void wonSurCoreano() {
		System.out.println("Cuantos Pesos Mexicanos quieres cambiar:...");
		double importe=scanner.nextInt();
	    double wonSurCoreano = 0.20;
	    double tc;
		tc = importe / wonSurCoreano;
		System.out.println("El Importe es: "+ tc + " Won Sur Coreano");
	}
}