package sistema.bilbioteca;

import lista.Lista;
import lista.Nodo;
import simulador.eventos.SimuladorEventos;

public class Libreria {
	
	private Lista listaLibros;
	private Lista listaClientes;
	private Lista listaPrestamos;
	private Lista listaEventos;
	private int gananciaEnPrestamos=0;
	
	public Libreria() {
		listaPrestamos = new Lista();
	}
	
	public void generarPrestamo(Prestamo prestamo) {
		this.agregarPrestamo(prestamo);
		//this.bloquearCliente(prestamo.getCliente());
		this.bloquearLibro(prestamo.getLibro());
	}
	
	public void terminarPrestamo(Prestamo prestamo) {
		prestamo.getCliente().setAcceso(true);
		//this.gananciaEnPrestamos+=;
		this.desbloquearLibro(prestamo.getLibro());
	}
	
	private void bloquearCliente(Cliente cliente) {
		Lista aux=this.listaClientes;
		cliente.setAcceso(false);
		aux.buscarPorRut(cliente.getRut()).setCliente(cliente);
		this.listaClientes=aux;
	}
	
	private void bloquearLibro(Libro libro) {
		Lista aux=this.listaLibros;
		libro.setEstaPrestado(true);;
		aux.buscarPorSerie(libro.getNumeroDeserie()).setLibro(libro);;
		this.listaClientes=aux;
	}
	
	private void desbloquearCliente(Cliente cliente) {
		Lista aux=this.listaClientes;
		cliente.setAcceso(false);
		aux.buscarPorRut(cliente.getRut()).setCliente(cliente);
		this.listaClientes=aux;
	}
	
	private void desbloquearLibro(Libro libro) {
		Lista aux=this.listaLibros;
		libro.setEstaPrestado(false);;
		aux.buscarPorSerie(libro.getNumeroDeserie()).setLibro(libro);;
		this.listaClientes=aux;
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
	
	public void imprimirEventos() {
		Lista lista = this.listaEventos;
		for(Nodo prestamo=lista.getcabeceraEventos();prestamo!=null;prestamo=prestamo.getEnlace())
			System.out.println(prestamo.getPrestamo().toString());
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

	public int getGananciaEnPrestamos() {
		return gananciaEnPrestamos;
	}

	public void setGananciaEnPrestamos(int gananciaEnPrestamos) {
		this.gananciaEnPrestamos = gananciaEnPrestamos;
	}
	
	public void agregarPrestamo(Prestamo prestamo) {
		Lista aux = this.listaPrestamos;
		aux.agregarPrestamo(prestamo);
		this.listaPrestamos=aux;
	}

	public Lista getListaEventos() {
		return listaEventos;
	}

	public void setListaEventos(Lista listaEventos) {
		this.listaEventos = listaEventos;
	}
}
