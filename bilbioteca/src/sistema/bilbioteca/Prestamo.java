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
		this.setDevolucion(null);
		this.calcularFechaEntrega();
	}
	
	public void calcularFechaEntrega() {
		this.setFechaTermino("Hacer el calculo");
	}
	
	public void generarDevolucion(String fecha) {
		this.setDevolucion(new Devolucion(fecha));
	}

	public String toString() {
		return this.cliente.getRut()+" "+this.libro.getNumeroDeserie()+" "+this.fechaInicio;
	}

	
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente=cliente;
	}

	public String getFechaTermino() {
		return fechaTermino;
	}


	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}


	public void setNumeroDeSerie(String numeroDeSerie) {
		this.numeroDeSerie = numeroDeSerie;
	}


	public Devolucion getDevolucion() {
		return devolucion;
	}


	public void setDevolucion(Devolucion devolucion) {
		this.devolucion = devolucion;
	}
	
	
	public String getFechaInicio() {
		return fechaInicio;
	}


	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
}
