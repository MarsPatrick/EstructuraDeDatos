package sistema.bilbioteca;

public class Devolucion {
	
	private String fecha;
	
	public Devolucion(String fecha) {
		this.setFecha(fecha);
	}

	
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

}
