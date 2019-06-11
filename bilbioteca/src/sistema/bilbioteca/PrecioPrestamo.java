package sistema.bilbioteca;

public class PrecioPrestamo {
	
	private Prestamo prestamo;
	private int precioPrestamo;
	private AtrasoEntrega atraso;
	
	public void generarMultaPorAtrasoDeEntrega() {
		this.setAtraso(new AtrasoEntrega());
		
	}
	
	public void calcularPrecioTotalDePrestamo() {
		
	}

	
	
	public Prestamo getPrestamo() {
		return prestamo;
	}

	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public int getPrecioPrestamo() {
		return precioPrestamo;
	}

	public void setPrecioPrestamo(int precioPrestamo) {
		this.precioPrestamo = precioPrestamo;
	}

	public AtrasoEntrega getAtraso() {
		return atraso;
	}

	public void setAtraso(AtrasoEntrega atraso) {
		this.atraso = atraso;
	}

}
