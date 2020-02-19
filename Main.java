package Actividad;

import Atributos.Placa;
import java.util.Scanner;
import Atributos.Propietario;
import Atributos.Tipo_Servicio;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner Scan = new Scanner(System.in);

		Propietario P1 = new Propietario("julio");
		Propietario P2 = new Propietario("Andres");
		Propietario P3 = new Propietario("Grover");
		
			
		Placa C1= new Placa("TYT123");
		Placa C2= new Placa("XVD213");
		Placa C3= new Placa("CXV321");
		
		Tipo_Servicio Tp1= new Tipo_Servicio("Publico");
		Tipo_Servicio Tp2= new Tipo_Servicio("Particular");
		Tipo_Servicio Tp3= new Tipo_Servicio("Publico");
		
		Vehículos ob1 = new Carro(P1,C1,Tp1);
		Vehículos ob2 = new Bus(P2,C2,Tp2);
		Vehículos ob3 = new Moto(P3,C3,Tp3);
		
		
		List <Vehículos> Vehículos = new ArrayList<Vehículos>();
			
		Vehículos.add(ob1);
		Vehículos.add(ob2);
		Vehículos.add(ob3);
		
	
		HashMap<String, Vehículos> MapVehículos = new HashMap<String,Vehículos>();
		
		for(Vehículos VehículoActual : Vehículos) {
			
			MapVehículos.put(VehículoActual.getPlaca().getDato(),VehículoActual);
			
		}
			
			System.out.println("Dijita la placa");
			
			String Pla = Scan.nextLine();
			
			System.out.println("Placa: " + MapVehículos.get(Pla).getPlaca().getDato()+" Propietario: "+ MapVehículos.get(Pla).getPropietario().getNombre()+" Servicio: "+MapVehículos.get(Pla).getTipo_Servicio().getTipo());
			
			System.out.println("tu vehículo es:");
			System.out.println("1: Carro");
			System.out.println("2: Bus");
			System.out.println("3: Moto");
		
			int n = Scan.nextInt();
			
			switch(n) {
			
			case 1:
				
				ob1.Consultar();
				
			break;
			
			case 2:
				ob2.Consultar();
			break;
				
			case 3:
				ob3.Consultar();
			break;
				
			
			}
	

		}
	}

