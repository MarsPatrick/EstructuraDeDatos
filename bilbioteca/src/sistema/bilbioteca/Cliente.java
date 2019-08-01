package sistema.bilbioteca;

import lista.Lista;

public class Cliente {
	
	private Lista listaLibros;
	private String rut;
	private String nombre;
	private String fechaNacimiento;
	private Lista prestamos;
	private boolean acceso;
	
	public Cliente(String rut,String nombre,String fechaNacimiento) {
		this.setRut(rut);
		this.setNombre(nombre);
		this.setFechaNacimiento(fechaNacimiento);
		this.setAcceso(true);
	}

	public String toString() {
		return this.rut+" "+this.nombre+" "+this.fechaNacimiento;
	}

	
	
	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Lista getListaLibros() {
		return listaLibros;
	}

	public void setListaLibros(Lista listaLibros) {
		this.listaLibros = listaLibros;
	}

	public Lista getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(Lista prestamos) {
		this.prestamos = prestamos;
	}

	public boolean isAcceso() {
		return acceso;
	}

	public void setAcceso(boolean acceso) {
		this.acceso = acceso;
	}
}
