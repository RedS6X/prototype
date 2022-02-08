package prototype;

public class Person implements IPrototype{
	
	public static Person p1 = new Person("A", 22);
	public static Person p2 = new Person("B", 23);
	
	private String nombre;
	private int edad;
		
	public Person(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public Person clone() {

		return new Person(this.nombre, this.edad);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(" Uno: " + p1.hashCode() + " Dos: " + p2.hashCode() + p1 + p2);
	}
	
	@Override
	public String toString() {

		return "\nPerson [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
		
}
