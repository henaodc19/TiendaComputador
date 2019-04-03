package com.main.papo;

import com.tiendaCompu.papo.Computador;
import com.tiendaCompu.papo.Tienda;

public class Main {

	public static void main(String[] args) {
		Tienda tienda = new Tienda("SHARO");
		Computador computador = new Computador(19, "lenovo", "idepad320", 1635000, 4, true);
		Computador computador1 = new Computador(12, "acer", "idepad25", 1835000, 8, false);
		Computador computador2 = new Computador(20, "lenovo", "idepad3", 1755000, 4, false);
		Computador computador3 = new Computador(15, "azus", "azus210", 2635000, 12, true);
		Computador computador4 = new Computador(22, "hp", "idepad15", 1345000, 4, true);
		Computador computador5 = new Computador(33, "hp", "hp45", 1135000, 8, false);
		
		tienda.agregar(computador);
		tienda.agregar(computador1);
		tienda.agregar(computador2);
		tienda.agregar(computador3);
		tienda.agregar(computador4);
		tienda.agregar(computador5);
		
		//tienda.buscar(true);
		//System.out.println(tienda.buscar(12).getMarca());
		//tienda.buscar("hp");
		//tienda.buscarQueTenganMasDe(8);
		//tienda.buscarQueValganMenos(1800000);
		//System.out.println(tienda.getCapacidad_actual());
		
		for (Computador esNuevo : tienda.getCompu()) {
			System.out.println(esNuevo.getMarca());
		}
		
		
		

	}

}
