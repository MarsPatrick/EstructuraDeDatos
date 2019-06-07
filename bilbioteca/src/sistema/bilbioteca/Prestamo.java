package sistema.bilbioteca;

public class Prestamo {
	
	private String numeroDeSerie;
	private Cliente cliente;
	private Libro libro;
	private String fechaInicio;
	private String fechaTermino;
	private int precio;
	private Devolucion devolucion;
	
	public Prestamo(Cliente cliente,int precio,String fechaInicio) {
		this.cliente=cliente;
		this.precio=precio;
		this.fechaInicio=fechaInicio;
		this.devolucion = null;
	}
	
	
	public void calcularFechaEntrega() {
		
	}
	
	public void generarDevolucion(String fecha) {
		this.devolucion = new Devolucion(fecha);
	}
	

}
