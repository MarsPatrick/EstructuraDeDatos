package main;

import lista.Nodo;
import simulador.eventos.SimuladorEventos;
import sistema.bilbioteca.Libreria;

public class Main {

	public static void main(String[] args) {
		Libreria l = new Libreria();
		SimuladorEventos s = new SimuladorEventos();
		Nodo puntero =s.listaPrestamos.getcabeceraPrestamos();
		int i=0;
		while(puntero.getEnlace()!=null) {
			l.generarPrestamo(puntero.getCliente(), puntero.getLibro(), puntero.getPrestamo().getFechaInicio());
			puntero=puntero.getEnlace();
		}
		//l.imprimirPrestamo();
	}

}
