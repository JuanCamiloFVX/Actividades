package Actividad;

import Atributos.Placa;
import Atributos.Propietario;
import Atributos.Tipo_Servicio;


public abstract class Vehículos {

	
	private Propietario Propietario;
	
	private Placa Placa;
	
	private Tipo_Servicio Tipo_Servicio;
	
	
	
		
	public  Vehículos(Atributos.Propietario propietario, Atributos.Placa placa, Atributos.Tipo_Servicio tipo_Servicio) {
	
		this.Propietario = propietario;
		this.Placa = placa;
		this.Tipo_Servicio = tipo_Servicio;
		
			
		}

	public abstract void Consultar();
		
	
	
	public Propietario getPropietario() {
		return Propietario;
	}

	public void setPropietario(Propietario propietario) {
		Propietario = propietario;
	}


	public Placa getPlaca() {
		return Placa;
	}


	public void setPlaca(Placa placa) {
		Placa = placa;
	}


	public Tipo_Servicio getTipo_Servicio() {
		return Tipo_Servicio;
	}

	public void setTipo_Servicio(Tipo_Servicio tipo_Servicio) {
		Tipo_Servicio = tipo_Servicio;
	}

	
}