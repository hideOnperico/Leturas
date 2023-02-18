package co.edu.unbosque.model;

public class Persona {
	private String nombre;
	private int alturacm;
	private String color;
	private char sexo;
	private int edadmeses;
	private String apellido;

	public Persona(String nombre, int alturacm, String color, char sexo, int edadmeses, String apellido) {
		super();
		this.nombre = nombre;
		this.alturacm = alturacm;
		this.color = color;
		this.sexo = sexo;
		this.edadmeses = edadmeses;
		this.apellido = apellido;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getAlturacm() {
		return alturacm;
	}



	public void setAlturacm(int alturacm) {
		this.alturacm = alturacm;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public char getSexo() {
		return sexo;
	}



	public void setSexo(char sexo) {
		this.sexo = sexo;
	}



	public int getEdadmeses() {
		return edadmeses;
	}



	public void setEdadmeses(int edadmeses) {
		this.edadmeses = edadmeses;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public void caminar(){
		System.out.println("camina");
	}
	public void comer(){
		System.out.println("come");
	}
	public void defecar(){
		System.out.println("defeca");
	} 

	

}
