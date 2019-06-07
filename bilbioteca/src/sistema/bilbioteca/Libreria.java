package sistema.bilbioteca;

import lista.Lista;
import lista.Nodo;
import simulador.eventos.SimuladorEventos;

public class Libreria {
	
	private Lista listaLibros;
	private Lista listaClientes;
	private Lista listaPrestamos;
	private int gananciaEnPrestamos;
	
	public Libreria() {
		SimuladorEventos s=new SimuladorEventos();
		this.listaClientes=s.listaClientes;
		this.listaLibros=s.listaLibros;
		this.listaPrestamos=s.listaPrestamos;
	}
	
	public void generarPrestamo(Cliente cliente, Libro libro) {
		
	}
	
	public void terminarPrestamo(Prestamo prestamo) {
		
	}
	
	private void bloquearCliente() {
		
	}

	public Lista getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(Lista listaClientes) {
		this.listaClientes = listaClientes;
	}

	public Lista getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(Lista listaLibros) {
		this.listaLibros = listaLibros;
	}
	
	public void imprimirClientes() {
		Lista lista = this.listaClientes;
		for(Nodo cliente=lista.getcabeceraCliente();cliente!=null;cliente=cliente.getEnlace())
			System.out.println(cliente.getCliente().toString());
	}
	
	public void imprimirLibros() {
		Lista lista = this.listaLibros;
		for(Nodo libro=lista.getcabeceraLibros();libro!=null;libro=libro.getEnlace())
			System.out.println(libro.getLibro().toString());
	}
	
	public void imprimirPrestamo() {
		Lista lista = this.listaPrestamos;
		for(Nodo prestamo=lista.getcabeceraPrestamos();prestamo!=null;prestamo=prestamo.getEnlace())
			System.out.println(prestamo.getPrestamo().toString());
	}
}
