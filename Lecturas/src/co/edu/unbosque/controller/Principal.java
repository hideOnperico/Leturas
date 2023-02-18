package co.edu.unbosque.controller;

import java.util.Scanner;

import co.edu.unbosque.model.Persona;

public class Principal {

	public static void main(String[] args) {
		Persona  persona1 = new Persona("juan",183,"rojo",'M',12,"humano");
		
		Scanner lector = new Scanner(System.in);
		System.out.println("inserte el nombre de la persona");
		String nombre=lector.nextLine();
		
		
		System.out.println("inserte la edad de la persona");
		int edad=lector.nextInt(); 
		
		lector.nextLine();
		
		System.out.println("inserte el color favorito de la persona");
		String color_favorito=lector.nextLine();
		
		System.out.println("inserte la altura de la persona");
		float altura=lector.nextFloat();
		
		System.out.println("inserte el sexo de la persona");
		char sexo=lector.next().charAt(0);
		
		
		System.out.println("El nombre que escribo es: "+nombre);
		System.out.println("la edad que escribo es: "+edad);
		System.out.println("El color que escribo es: "+color_favorito);
		System.out.println("La altura es: "+altura+"m");
		System.out.println("Su sexo es: "+sexo);
		
		//Persona p1 = new Persona(nombre, edad, color_favorito, altura, sexo);
		
		System.out.println(persona1.getEdadmeses());
		
		
       
		
		

	}

}
