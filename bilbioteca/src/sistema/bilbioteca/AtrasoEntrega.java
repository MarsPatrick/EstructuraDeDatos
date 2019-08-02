package sistema.bilbioteca;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class AtrasoEntrega {
	
	private int precioAtraso;
	
	public AtrasoEntrega() {
		this.setPrecioAtraso(0);
	}
	
	public void calcularPrecioAtraso(String fechaInicio, String fechaEntrega) {
		String[] fechArray = fechaInicio.split("-");
	    String[] fechArray2 = fechaEntrega.split("-");
	    
	    //Valor diario de la multa por dia
	    int valordiario=1000;
	    //Plazo de entrega en dias
	    int plazoEntrega=14;

	    int dia = Integer.valueOf(fechArray[0]);
	    int mes = Integer.valueOf(fechArray[1]) - 1;
	    int año = Integer.valueOf(fechArray[2]);

	    int dia2 = Integer.valueOf(fechArray2[0]);
	    int mes2 = Integer.valueOf(fechArray2[1]) - 1;
	    int año2 = Integer.valueOf(fechArray2[2]);

	    Calendar c1 = new GregorianCalendar(año, mes, dia);
	    Calendar c2 = new GregorianCalendar(año2, mes2, dia2);
	    c1.add(c1.DAY_OF_MONTH , plazoEntrega);



	    long milisec = c2.getTimeInMillis()-c1.getTimeInMillis();
	    long days = milisec/1000/60/60/24;

	    int multa= valordiario*(int)days;
	    this.setPrecioAtraso(multa);
	}

	
	
	public int getPrecioAtraso() {
		return precioAtraso;
	}

	public void setPrecioAtraso(int precioAtraso) {
		this.precioAtraso = precioAtraso;
	}

}
