package sistema.bilbioteca;

public class Libro {
	
	
	private String numeroDeserie;
	private int precioPrestamo;
	private String genero;
	private String nombre;
	private String autores;
	private boolean estaPrestado=false;
	
	public Libro(String numeroDeserie, int precioPrestamo, String genero, String nombre,String autores) {
		this.setNumeroDeserie(numeroDeserie);
		this.setPrecioPrestamo(precioPrestamo);
		this.setGenero(genero);
		this.setNombre(nombre);
		this.setAutores(autores);
	}

	public String toString() {
		return this.numeroDeserie+" "+this.precioPrestamo+" "+this.genero+" "+this.nombre+" "+this.autores+" "+this.estaPrestado;
	}
	
	
	
	public String getNumeroDeserie() {
		return numeroDeserie;
	}

	public void setNumeroDeserie(String numeroDeserie) {
		this.numeroDeserie = numeroDeserie;
	}

	public int getPrecioPrestamo() {
		return precioPrestamo;
	}

	public void setPrecioPrestamo(int precioPrestamo) {
		this.precioPrestamo = precioPrestamo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String autores) {
		this.autores = autores;
	}

	public boolean isEstaPrestado() {
		return estaPrestado;
	}

	public void setEstaPrestado(boolean estaPrestado) {
		this.estaPrestado = estaPrestado;
	}
	
}
