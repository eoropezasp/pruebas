package ejercicioPokemon;

public class Charmander extends Pokemon implements IFuego{

	public Charmander() {
		
	}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("soy Charmander y este es mi ataque placaje ");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("soy Charmander y este es mi ataque arañaso ");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("soy Charmander y este es mi ataque mordisco ");
		
	}

	@Override
	public void atacarPunioFuego() {
		System.out.println("soy Charmander y este es mi ataque puño fuego ");
		
	}

	@Override
	public void atacarLanzallamas() {
		System.out.println("soy Charmander y este es mi ataque lanzallamas");
		
	}

	@Override
	public void atacarAscuas() {
		System.out.println("soy Charmander y este es mi ataque ascuas ");
		
	}

}
