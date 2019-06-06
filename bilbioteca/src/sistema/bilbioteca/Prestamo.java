package sistema.bilbioteca;

public class Prestamo {
	
	private String numeroDeSerie;
	private Cliente cliente;
	private Libro libro;
	private String fechaInicio;
	private String fechaTermino;
	private PrecioPrestamo precioPrestamo;
	private Devolucion devolucion;
	
	public Prestamo() {
		this.devolucion = null;
	}
	
	
	public void calcularFechaEntrega() {
		
	}
	
	public void generarDevolucion(String fecha) {
		this.devolucion = new Devolucion(fecha);
	}
	

}
