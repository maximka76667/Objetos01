package ej1_reloj;

public class Reloj {
	
	String marca, modelo;
	double precio;
	int stock;
	boolean esDigital;
	
	public Reloj(String marca, String modelo, double precio, int stock, boolean esDigital) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.stock = stock;
		this.esDigital = esDigital;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return this.stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isEsDigital() {
		return this.esDigital;
	}

	public void setEsDigital(boolean esDigital) {
		this.esDigital = esDigital;
	}
	
}
