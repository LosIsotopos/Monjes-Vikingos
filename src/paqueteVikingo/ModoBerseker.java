package paqueteVikingo;

public class ModoBerseker implements State {
	Estado estado = Estado.BERSERKER;
	private int calma = 0;
	@Override
	public int getAtaque(int ataque) {
		
		return 3*ataque;
	}

	@Override
	public int getDefensa(int defensa) {
		
		return 1;
	}

	@Override
	public State calmar() {
		calma++;
		if( calma == 3) {
			calma = 0;
			return new ModoNormal();
		}
		return this;
	}

	@Override
	public State recibirDano(Vikingo v1, int dano) {
		return this;
	}

	public Estado getEstado() {
		return estado;
	}
	
	



}
