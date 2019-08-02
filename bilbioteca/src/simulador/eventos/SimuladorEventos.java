package simulador.eventos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import lista.Lista;
import lista.Nodo;
import sistema.bilbioteca.Cliente;
import sistema.bilbioteca.Libro;
import sistema.bilbioteca.Prestamo;

public class SimuladorEventos {
	
	public static final String FILE_NAME_SIMULATOR = "datos_simulacion.txt";
	public static final String FILE_NAME_CLIENTS = "datos_clientes.txt";
	public static final String FILE_NAME_BOOKS = "datos_libros.txt";
	private ArrayList<String> datosSimulacion;
	public Lista listaClientes;
	public Lista listaLibros;
	public Lista listaEventos;
	
	public SimuladorEventos() {
		
		this.datosSimulacion = new ArrayList<String>();
		
		try {
			listaClientes=this.crearClientes();
			listaLibros=this.crearLibreria();
			
		} catch (IOException e) {
			e.printStackTrace();
		}	
		this.comenzarSimulacion();
	}
	
	
	private void comenzarSimulacion() {
		try {
			listaEventos=crearDatosSimulador();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}



	private Lista crearDatosSimulador() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(SimuladorEventos.class.getResource(FILE_NAME_SIMULATOR).getPath()));
		Lista listaEventos=new Lista();
		Lista listaEventosFinal=new Lista();
		try {
		    String line = br.readLine();

		    while (line != null) {
		    	if(line != null)
		        	datosSimulacion.add(line);
		        line = br.readLine();  
		    }
		    
		    for (String linea : datosSimulacion) {
				String [] sd = linea.split(", ");
				//sd[0]=Tipo de accion; P=Prestamo D=Devolucion
				//sd[1]=Rut de cliente
				//sd[2]=Serie de libro
				//sd[3]=Fecha
				
				if(sd[0].equalsIgnoreCase("p")) {
					//efectuar el prestamo
				}
				if(sd[0].equalsIgnoreCase("d")) {
					//efectuar la devolucion
				}
				Cliente c=listaClientes.buscarPorRut(sd[1]).getCliente();
				Libro l=listaLibros.buscarPorSerie(sd[2]).getLibro();
				Prestamo p = new Prestamo(c,l,sd[3]);
				listaEventos.agregarEventos(p);
			}
		    
		} finally {
		    br.close();
		}
		
		for(Nodo p=listaEventos.getcabeceraEventos();p!=null;p=p.getEnlace())
			listaEventosFinal.agregarEventos(p.getPrestamo());
		
		return listaEventosFinal;
	}


	private Lista crearLibreria() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader(SimuladorEventos.class.getResource(FILE_NAME_BOOKS).getPath()));
		Lista listaLibros = new Lista();
		Lista listaLibrosFinal = new Lista();
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
				//data[0]=Numero de serie
				//data[1]=Precio de prestamo
				//data[2]=Genero
				//data[3]=Nombre
				//data[4]=Autores
				int precio=Integer.parseInt(data[1].trim());
				Libro l = new Libro(data[0],precio,data[2],data[3],data[4]);
				listaLibros.agregar(l);
			}
		} finally {
		    br.close();
		}
		for(Nodo l=listaLibros.getcabeceraLibros();l!=null;l=l.getEnlace())
			listaLibrosFinal.agregar(l.getLibro());
		
		return listaLibrosFinal;
	}

	public Lista crearClientes() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(SimuladorEventos.class.getResource(FILE_NAME_CLIENTS).getPath()));
		Lista listaClientes = new Lista();
		Lista listaClientesFinal = new Lista();
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
				//data[0]=Rut cliente
				//data[1]=Nombre Cliente
				//data[2]=Fecha de nacimiento
				Cliente c = new Cliente(data[0],data[1],data[2]);
				listaClientes.agregar(c);
			}    
		} finally {
		    br.close();
		}
		for(Nodo c=listaClientes.getcabeceraCliente();c!=null;c=c.getEnlace())
			listaClientesFinal.agregar(c.getCliente());
		return listaClientesFinal;
	}
	
	
	
	
	

}
