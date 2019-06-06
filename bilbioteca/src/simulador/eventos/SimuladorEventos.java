package simulador.eventos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Random;

import lista.Lista;
import lista.Nodo;
import sistema.bilbioteca.Cliente;
import sistema.bilbioteca.Libro;

public class SimuladorEventos {
	
	public static final String FILE_NAME_SIMULATOR = "datos_simulacion.txt";
	public static final String FILE_NAME_CLIENTS = "datos_clientes.txt";
	public static final String FILE_NAME_BOOKS = "datos_libros.txt";
	private ArrayList<String> datosSimulacion;
	
	public SimuladorEventos() {
		
		this.datosSimulacion = new ArrayList<String>();
		
		try {
			this.crearClientes();
			this.crearLibreria();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		this.comenzarSimulacion();
	}
	
	
	private void comenzarSimulacion() {
		try {
			crearDatosSimulador();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}



	private void crearDatosSimulador() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(SimuladorEventos.class.getResource(FILE_NAME_SIMULATOR).getPath()));
		try {
		    String line = br.readLine();

		    while (line != null) {
		    	if(line != null)
		        	datosSimulacion.add(line);
		        line = br.readLine();
		        
		    }
		    
		    for (String linea : datosSimulacion) {
				String [] sd = linea.split(", ");
				System.out.println(sd[0]+", "+ sd[1]+", "+sd[2]+", "+sd[3]);
			}
		    
		} finally {
		    br.close();
		}
	}


	private Lista crearLibreria() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(SimuladorEventos.class.getResource(FILE_NAME_BOOKS).getPath()));
		Lista listaLibros = new Lista();
		try {
		    String line = br.readLine();
		    ArrayList<String> lineas = new ArrayList<String>();

		    while (line != null) {
		    	if(line != null)
		        	lineas.add(line);
		        line = br.readLine();
		        
		    }
		    
		    for (String linea : lineas) {
				String [] data = linea.split(",");
				int precio=Integer.parseInt(data[1].trim());
				Libro l = new Libro(data[0],precio,data[2],data[3],data[4]);
				listaLibros.agregar(l);
			}
		} finally {
		    br.close();
		}
		return listaLibros;
	}

	public Lista crearClientes() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(SimuladorEventos.class.getResource(FILE_NAME_CLIENTS).getPath()));
		Lista listaClientes = new Lista();
		try {
		    String line = br.readLine();
		    ArrayList<String> lineas = new ArrayList<String>();

		    while (line != null) {
		    	if(line != null)
		        	lineas.add(line);
		        line = br.readLine(); 
		    }
		    
		    for (String linea : lineas) {
				String [] data = linea.split(",");
				Cliente c = new Cliente(data[0],data[1],data[2]);
				listaClientes.agregar(c);
			}    
		} finally {
		    br.close();
		}
		return listaClientes;
	}
	
	
	
	
	

}
