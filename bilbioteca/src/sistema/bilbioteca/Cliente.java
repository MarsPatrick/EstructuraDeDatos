package sistema.bilbioteca;

import lista.Lista;

public class Cliente {
	
	private Lista listaLibros;
	private String rut;
	private String nombre;
	private String fechaNacimiento;
	private Lista prestamos;
	
	public Cliente(String rut,String nombre,String fechaNacimiento) {
		this.setRut(rut);
		this.setNombre(nombre);
		this.setFechaNacimiento(fechaNacimiento);
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
}
