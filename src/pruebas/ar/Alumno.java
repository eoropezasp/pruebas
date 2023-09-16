package pruebas.ar;

public class Alumno extends Persona {

	private String apellido;

	public Alumno(String nombre, String apellido) {
		super(nombre);
		this.apellido = apellido;
	}

	@Override
	public void correr() {
		System.out.println("el alumno corre");

	}

}
