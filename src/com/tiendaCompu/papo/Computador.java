package com.tiendaCompu.papo;

public class Computador {
	private long serial;
	private String marca;
	private String modelo;
	private int precio;
	private int ram;
	private boolean esNuevo;
	
	public Computador(long serial, String marca, String modelo, int precio, int ram, boolean esNuevo) {
		this.serial = serial;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.ram = ram;
		this.esNuevo = esNuevo;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public boolean isEsNuevo() {
		return esNuevo;
	}

	public void setEsNuevo(boolean esNuevo) {
		this.esNuevo = esNuevo;
	}
	
	
	
}
