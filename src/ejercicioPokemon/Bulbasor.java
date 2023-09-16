package ejercicioPokemon;

public class Bulbasor extends Pokemon implements IPlanta{

	
	
	
	public Bulbasor() {
	
	}

	@Override
	protected void atacarPlacaje() {
		System.out.println("soy Bulbasor y este es mi ataque placaje ");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("soy Bulbasor y este es mi ataque arañaso ");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("soy Bulbasor y este es mi ataque mordisco ");
		
	}

	@Override
	public void atacarDrenaje() {
		System.out.println("soy Bulbasor y este es mi ataque drenaje ");
		
	}

	@Override
	public void atacarParalizar() {
		System.out.println("soy Bulbasor y este es mi ataque paralizar ");
		
	}

}
