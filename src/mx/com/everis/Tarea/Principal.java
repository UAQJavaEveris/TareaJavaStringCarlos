package mx.com.everis.Tarea;

import java.util.Random;
public class Principal {

	public static void main(String[] args) {
	    Random rdm = new Random();
		String cadena="Hola mundo desde el taller de java";
		System.out.println(cadena.replace(" ", ""+rdm.nextInt()));

	}

}
