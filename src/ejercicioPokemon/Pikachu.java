package ejercicioPokemon;

public class Pikachu extends Pokemon implements IElectrico {

	public Pikachu() {
		
	}
	
	@Override
	protected void atacarPlacaje() {
		System.out.println("soy Pikachu y este es mi ataque placaje ");
		
	}

	@Override
	protected void atacarAraniazo() {
		System.out.println("soy Pikachu y este es mi ataque arañaso ");
		
	}

	@Override
	protected void atacarMordisco() {
		System.out.println("soy Pikachu y este es mi ataque mordisco ");
		
	}

	@Override
	public void atacarImpactrueno() {
		System.out.println("soy Pikachu y este es mi ataque impactrueno");
	}

	@Override
	public void atacarPuñotrueno() {
		
		System.out.println("soy Pikachu y este es mi ataque puñotrueno ");
	}

}
