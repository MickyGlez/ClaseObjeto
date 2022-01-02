package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Perro lassie = new Perro();
		
		lassie.establecerAtributos("Sony", "Pitbull", 2);//argumentos
		/*
		lassie.nombre = "Kyra";
		lassie.edad = 2;
		lassie.raza = "Pitbull";
		*/
		System.out.println("El nombre es: " + lassie.nombre);
		System.out.println("La raza es: " + lassie.raza);
		System.out.println("La esad es: " + lassie.edad);

		//usar metodos
		lassie.comer();
		lassie.dormir();
		lassie.ladrar();
		
	}
	

}
