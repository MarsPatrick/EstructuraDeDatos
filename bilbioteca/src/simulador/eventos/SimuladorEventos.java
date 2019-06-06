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


	private void crearLibreria() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(SimuladorEventos.class.getResource(FILE_NAME_BOOKS).getPath()));
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
				System.out.print(data[0]);
				System.out.print(data[1]);	
				System.out.print(data[2]);	
				System.out.print(data[3]);	
				System.out.print(data[4]);	
				System.out.println();
			}
		} finally {
		    br.close();
		}
	}

	private void crearClientes() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(SimuladorEventos.class.getResource(FILE_NAME_CLIENTS).getPath()));
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
				System.out.print(data[0]);
				System.out.print(data[1]);
				System.out.print(data[2]);
				System.out.println();
			}
		    
		} finally {
		    br.close();
		}
		
	}
	
	
	
	
	

}
