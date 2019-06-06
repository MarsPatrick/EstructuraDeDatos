package lista;

import sistema.bilbioteca.Cliente;
import sistema.bilbioteca.Libro;
import sistema.bilbioteca.Prestamo;

public class Lista {
	
	private Nodo cabeceraCliente;
	private Nodo cabeceraLibros;
	private Nodo cabeceraPrestamos;
	
	public Lista() {
		cabeceraCliente=null;
		cabeceraLibros=null;
		cabeceraPrestamos=null;
	}
	
	public void agregar(Cliente cliente) {
		Nodo nodo=new Nodo(cliente);
		nodo.setEnlace(cabeceraCliente);
		this.cabeceraCliente=nodo;
	}
	
	public void agregar(Libro libro) {
		Nodo nodo=new Nodo(libro);
		nodo.setEnlace(cabeceraLibros);
		this.cabeceraLibros=nodo;
	}
	
	public void agregar(Prestamo prestamo) {
		Nodo nodo=new Nodo(prestamo);
		nodo.setEnlace(cabeceraPrestamos);
		this.cabeceraPrestamos=nodo;
	}
	
	public Nodo getcabeceraCliente() {
		return this.cabeceraCliente;
	}
	
	public Nodo getcabeceraLibros() {
		return this.cabeceraLibros;
	}
	
	public Nodo getcabeceraPrestamos() {
		return this.cabeceraPrestamos;
	}
	
}
