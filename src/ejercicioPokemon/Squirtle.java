package ejercicioPokemon;

public class Squirtle extends Pokemon implements IAgua {

	public Squirtle() {
		
	}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("soy Squirtle y este es mi ataque placaje ");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("soy Squirtle y este es mi ataque arañaso ");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("soy Squirtle y este es mi ataque mordisco ");
		
	}

	@Override
	public void atacarIdrobomba() {
		System.out.println("soy Squirtle y este es mi ataque idrobomba ");
		
	}

	@Override
	public void atacarBurbuja() {
		System.out.println("soy Squirtle y este es mi ataque burbuja ");
		
	}

	@Override
	public void atacarPistolaAgua() {
		
		System.out.println("soy Squirtle y este es mi ataque pistola de agua ");
	}

}
