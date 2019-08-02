package lista;

import sistema.bilbioteca.Cliente;
import sistema.bilbioteca.Libro;
import sistema.bilbioteca.Prestamo;

public class Lista {
	
	private Nodo cabeceraCliente;
	private Nodo cabeceraLibros;
	private Nodo cabeceraPrestamos;
	private Nodo cabeceraEventos;
	
	public Lista() {
		cabeceraCliente=null;
		cabeceraLibros=null;
		cabeceraPrestamos=null;
		cabeceraEventos=null;
	}
	
	public void agregar(Cliente cliente) {
		Nodo nodo=new Nodo(cliente);
		Nodo aux=cabeceraCliente;
		this.cabeceraCliente=nodo;
		nodo.setEnlace(aux);
	}
	
	public void agregar(Libro libro) {
		Nodo nodo=new Nodo(libro);
		Nodo aux=cabeceraLibros;
		this.cabeceraLibros=nodo;
		nodo.setEnlace(aux);	
	}
	
	public void agregarPrestamo(Prestamo prestamo) {
		Nodo nodo=new Nodo(prestamo);
		Nodo aux=cabeceraPrestamos;
		this.cabeceraPrestamos=nodo;
		nodo.setEnlace(aux);
	}
	
	public void agregarEventos(Prestamo prestamo) {
		Nodo nodo=new Nodo(prestamo);
		Nodo aux=cabeceraEventos;
		this.cabeceraEventos=nodo;
		nodo.setEnlace(aux);
	}
	
	public Nodo buscarPorRut(String rut) {
		for(Nodo i=cabeceraCliente;i!=null;i=i.getEnlace()) {
			if(i.getCliente().getRut().equalsIgnoreCase(rut))
				return i;
		}
		return null;
	}
	
	public Nodo buscarPorSerie(String serie) {
		for(Nodo i=cabeceraLibros;i!=null;i=i.getEnlace()) {
			if(i.getLibro().getNumeroDeserie().equalsIgnoreCase(serie))
				return i;
		}
		return null;
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
	

	public Nodo getcabeceraEventos() {
		return cabeceraEventos;
	}
}