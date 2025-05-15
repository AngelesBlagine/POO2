package ejercicio.zapallo;

import java.util.Random;
import java.util.Stack;

public class Agricultor {
	//Atributos
	
	//tienen zapallos apilados
	private Stack<Zapallo> zapallos;
	private Zapallo zapallo;
	
	//Contructor
	public Agricultor() {
		this.setZapallos(new Stack<Zapallo>());
		this.zapallo = null;
	}
	
	//Métodos
	
	//Acomoda zapallos en cajas con su costo "C" y arma una pila de un tamaño "K"
	public void apilarZapallos() {
		Random aleatorio = new Random();
		int tamañoPila = aleatorio.nextInt(1200) + 1; //El tamaño de la pila puede estar entre 1 y 1200
		
		for(int i = 0; i < tamañoPila; i++) {
			this.zapallo.setCosto(aleatorio.nextInt(20) + 1); //El costo del Zapallo varía entre 1 y 20
			this.zapallos.push(zapallo); //Apilamos el zapallo
		} 		
	}
	
	

	//--Getters y Setters
	public Stack<Zapallo> getZapallos() {
		return zapallos;
	}

	public void setZapallos(Stack<Zapallo> zapallos) {
		this.zapallos = zapallos;
	}
	
	
	//Main
		public static void main(String[] args) {
			//Existen varios "A" agricultores
			Agricultor agri1 = new Agricultor();
			Agricultor agri2 = new Agricultor();
			Agricultor agri3 = new Agricultor();
			
		}
}
