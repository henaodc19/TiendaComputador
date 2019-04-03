package com.tiendaCompu.papo;

import java.util.ArrayList;
import java.util.Arrays;

public class Tienda {
 public static final int CAPACIDAD_TOTAL = 15;
 private String nombre;
 private int capacidad_actual;
 static ArrayList<Computador> computadores = new ArrayList<>(Arrays.asList());
 ArrayList<Computador> compu = new ArrayList<>(Arrays.asList());
 
 public Tienda(String nombre) {
	 super();
	 this.nombre = nombre;
 }
 
 public boolean agregar(Computador pc ){
	
	 boolean validador = false;
	 if(capacidad_actual > 0){
		 for (int i = 0; i <= computadores.size(); i++) {
			 if(computadores.get(i).getSerial() != pc.getSerial() && capacidad_actual < CAPACIDAD_TOTAL){
					computadores.add(pc);
					validador = true;
					capacidad_actual++;
					break;
				}
		}
				
	 }
	 else{
		computadores.add(pc);
		validador = true;
		capacidad_actual++;
	 }
	return validador;
 }
 
 public Computador buscar(long serial){
	 Computador compu = null;
	for (Computador computador : computadores) {
		if(computador.getSerial() == serial){
			compu = computador;
		}
	}
	return compu;
 }
 
 public ArrayList<Computador> buscar(String marca){
	 
	for (int i = 0; i < computadores.size(); i++) {

		if(computadores.get(i).getMarca() == marca){
			compu.add(computadores.get(i));
		}
	}
	
	return compu;
				 
 }
 
 public ArrayList<Computador> buscar(boolean soloNuevo){
	 
		for (int i = 0; i < computadores.size(); i++) {
			if(soloNuevo && computadores.get(i).isEsNuevo()){
				compu.add(computadores.get(i));
			}
		}
		return compu;
			 
 }
 
 public ArrayList<Computador> getCompu() {
	return compu;
}

public void setCompu(ArrayList<Computador> compu) {
	this.compu = compu;
}

public ArrayList<Computador> buscarQueValganMenos(int precio){
	 
		for (int i = 0; i < computadores.size(); i++) {
			if(computadores.get(i).getPrecio() < precio){
				compu.add(computadores.get(i));
			}
		}
		
		return compu;
				 
	 }
 
 public ArrayList<Computador> buscarQueTenganMasDe(int ram){
	 
	 
	 for (int i = 0; i < computadores.size(); i++) {
			if(computadores.get(i).getRam() >= ram){
				compu.add(computadores.get(i));
			}
		}
		
		return compu;
				 
	 }
 
 public void vender(Computador pc){
	 for (Computador computador : computadores) {
		if(computador == pc){
			computadores.remove(pc);
			capacidad_actual--;
		}
	}
 }

public int getCapacidad_actual() {
	return capacidad_actual;
}

public ArrayList<Computador> getComputadores() {
	return computadores;
}

public void setComputadores(ArrayList<Computador> computadores) {
	this.computadores = computadores;
}
 
 
 
 
}
