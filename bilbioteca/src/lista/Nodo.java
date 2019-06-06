package lista;

import sistema.bilbioteca.Cliente;
import sistema.bilbioteca.Libro;
import sistema.bilbioteca.Prestamo;

public class Nodo{
	
	private Libro libro;
	private Cliente cliente;
	private Prestamo prestamo;
	private Nodo enlace;
	
	public Nodo(Cliente cliente){
		this.setCliente(cliente);
		this.enlace = null;
	}
	
	public Nodo(Libro libro){
		this.setLibro(libro);
		this.enlace=null;
	}
	
	public Nodo(Prestamo prestamo) {
		this.setPrestamo(prestamo);
		this.enlace=null;
	}

	public Nodo getEnlace() {
		return enlace;
	}

	public void setEnlace(Nodo enlace) {
		this.enlace = enlace;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}
}