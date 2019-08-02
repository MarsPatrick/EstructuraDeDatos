package main;

import lista.Lista;
import lista.Nodo;
import simulador.eventos.SimuladorEventos;
import sistema.bilbioteca.Libreria;
import sistema.bilbioteca.Prestamo;

public class main {

	public static void main(String[] args) {
		
		SimuladorEventos s= new SimuladorEventos();
		Libreria l = new Libreria();
		l.setListaClientes(s.listaClientes);
		l.setListaLibros(s.listaLibros);
		Lista eventos = s.listaEventos;
		
		Nodo puntero = eventos.getcabeceraEventos();
		while(puntero!=null) {
			Prestamo prestamo = puntero.getPrestamo();
			if(prestamo.isEsPrestamo()) {
				l.generarPrestamo(prestamo);
			}else {
				l.terminarPrestamo(prestamo);
			}
			puntero = puntero.getEnlace();
		}
		
		//l.imprimirClientes();
		//l.imprimirLibros();
		//l.imprimirPrestamo();
	}
}