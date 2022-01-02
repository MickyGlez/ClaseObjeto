package main;

public class Perro {

	String nombre;
	String raza;
	int edad;
	
	//Parametros
	
	/*void establecerAtributos(String nombrePerro, String razaPerro, int edadPerro) {
		nombre = nombrePerro;
		raza = razaPerro;
		edad = edadPerro;
	}*/
	void establecerAtributos(String nombre, String raza, int edad) {
		this.nombre = nombre;
		this.raza = raza;
		this.edad = edad;
	}
	//Metodos
	void comer() {
		System.out.println("El perro se encuentra comiendo!");
	}
	void dormir() {
		System.out.println("El perro se encuentra durmiendo!");
	}
	void ladrar() {
		System.out.println("El perro se encuentra ladrando!");
	}
	
	
}
