package sistema.bilbioteca;

import lista.Lista;

public class Libro {
	
	
	private String numeroDeserie;
	private int precioPrestamo;
	private String genero;
	private String nombre;
	private String autores;
	
	public Libro(String numeroDeserie, int precioPrestamo, String genero, String nombre) {
		this.numeroDeserie=numeroDeserie;
		this.precioPrestamo=precioPrestamo;
		this.genero=genero;
		this.nombre=nombre;
		
	}
	
}
