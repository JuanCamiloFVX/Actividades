package Actividad;
import java.util.Scanner;

public class Carro extends Vehículos {

	public Carro(Atributos.Propietario propietario, Atributos.Placa placa, Atributos.Tipo_Servicio tipo_Servicio) {
		super(propietario, placa, tipo_Servicio);
		
		
		
	}
	
	Scanner Scan2 = new Scanner(System.in);

	public void Consultar() {
		
		
		System.out.println("1: Si paga mensualidad");
		System.out.println("2: Si paga el servicio por horas");
		
		int r = Scan2.nextInt();
		
		switch(r) {
		
		case 1:
			
			System.out.println("Su valor apagar es la mensualidad a cordada");
		
		break;
		
		case 2:
			System.out.println("Cuantas horas estara el Vehículo");
			
			int y = Scan2.nextInt();
			
			if (y>6) {
				
				System.out.println("Tiene un cobro adicional del 5% por exeder las 6 horas");
				
			}else {
				
				System.out.println("Su valor a pagar es la tarifa estandar");
			}
			
			break;
		}
		
		
	}

	}


