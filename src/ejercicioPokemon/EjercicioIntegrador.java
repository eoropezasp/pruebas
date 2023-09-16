package ejercicioPokemon;

public class EjercicioIntegrador {

	public static void main(String[] args) {
	
		
		Squirtle squirtle = new Squirtle();
		Charmander charmander = new Charmander();
		Bulbasor bulbasor = new Bulbasor();
		Pikachu pikachu = new Pikachu();
		
		
		squirtle.atacarAraniazo();
		squirtle.atacarIdrobomba();
		
		
		charmander.atacarAraniazo();
		charmander.atacarLanzallamas();
		
		bulbasor.atacarAraniazo();
		bulbasor.atacarDrenaje();
		
		pikachu.atacarAraniazo();
		pikachu.atacarImpactrueno();
		
		

	}

}
