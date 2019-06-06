package simulador.eventos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

public class DatosRandom {
		
	
	public static String randomFecha(int mes) {
		Random random = new Random();
		int minDay = (int) LocalDate.of(2018, mes, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2018, mes+1, 31).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);
		
		DateTimeFormatter formatters = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	    
		
		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		String text = randomBirthDate.format(formatters);
		
		
		
	
		return text;
	}

	
}
