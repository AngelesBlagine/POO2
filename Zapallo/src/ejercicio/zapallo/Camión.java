package ejercicio.zapallo;

import java.util.Random;

public class Camión {
	//Atributos
	private int tamañoCamión;
	Random aleatorio = new Random();
	
	//Constructor
	public Camión() {
		setTamañoCamión();
	}
	
	//Métodos
	
	public int getTamañoCamión() {
		return tamañoCamión;
	}
	public void setTamañoCamión() {
		this.tamañoCamión = aleatorio.nextInt(1000)+1; //El camión tendrá un tamaño entre 1 y 1000
	}
}
