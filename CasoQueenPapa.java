//Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa hahahahah
import java.util.Scanner;
public class CasoQueenPapa {
	
	public static void main(String[] args) {
	
		/* Contexto:
		Camila es una joven que ha abierto un restaurante que vende salchipapas. 
		Ha solicitado un programa que permita calcular el precio total de cada compra que
		hagan sus clientes teniendo en cuenta el valor fijo de cada salchipapa, 
		la cantidad que elija comprar el cliente y el impuesto que ha puesto el gobierno respecto al consumo. 
		*/
		
		//Variables
		
		/*Primero definiremos las variables que necesitaremos. Posteriormente,
		le asignaremos valor a las que corresponden al porcentaje que cobra el gobierno
		y al valor fijo de una salchipapa. Primero asignaremos las que son de carácter 
		entero y luego las de tipo double como lo son el impuesto y el impuesto y el
		valor a pagar por el cliente
		*/
		
		int valSalchi, cantSalchi, valSinImp;
		
		valSalchi = 65000;
	
		double impuesto, valdelImpu, totalPagar;
		
		//El impuesto al consumo cobrado por el gobierno es del 8%
		impuesto = 0.08;
		
		//Entradas
		
		//Para esta parte, tenemos como entrada la cantidad de salchipapas que llevará el cliente
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bienbenido a QueenPapa ");
		System.out.println("Por favor, ingrese la cantidad de salchipapas que llevará el cliente: ");
		
		cantSalchi = entrada.nextInt();
		
		//Proceso
		
		/* Para esta parte, empezaremos a asignar las operaciones que el programa debe
		ejecutar para llevar a cabo el proceso que necesita el cliente que haga.
		*/
		
		valSinImp = cantSalchi * valSalchi; //Valor a pagar sin el impuesto agregado
		
		valdelImpu = valSinImp * impuesto; //Valor del impuesto que debe pagar el cliente
		
		totalPagar = valdelImpu + valSinImp; //Suma del valor a pagar y el impuesto agregado
		
		//Salidas 
		
		System.out.println(" ");
		System.out.println("··············¡QUEEN PAPA!···········");
		System.out.println("···········¡FACTURA DE VENTA!········");
		System.out.println(" ");
		System.out.println(cantSalchi + " x QueenSalchi............ $" + valSinImp);
		System.out.println("Impuesto al consumo x 8%... $" + valdelImpu);
		System.out.println("Total a pagar............. $" + totalPagar);
		System.out.println(" ");
		System.out.println("·········¡Gracias por su compra!······");
		System.out.println(" ");
	}
}
