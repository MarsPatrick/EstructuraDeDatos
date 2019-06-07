package sistema.bilbioteca;

public class Prestamo {
	
	private String numeroDeSerie;
	private Cliente cliente;
	private Libro libro;
	private String fechaInicio;
	private String fechaTermino;
	private int precio;
	private Devolucion devolucion;
	
	public Prestamo(Cliente cliente,Libro libro,String fechaInicio) {
		this.cliente=cliente;
		this.libro=libro;
		this.fechaInicio=fechaInicio;
		this.devolucion = null;
	}
	
	
	public void calcularFechaEntrega() {
		
	}
	
	public void generarDevolucion(String fecha) {
		this.devolucion = new Devolucion(fecha);
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}

	public String toString() {
		return this.cliente.getRut()+" "+this.libro.getNumeroDeserie()+" "+this.fechaInicio;
	}
}
