package sistema.bilbioteca;

import lista.Lista;
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
	
	public void agregarCliente(Cliente cliente) {
		this.listaClientes.agregar(cliente);
	}
	
	public void agregarLibro(Libro libro) {
		this.listaLibros.agregar(libro);
	}
}
