package paqueteVikingo;

public class ModoNormal implements State {
	Estado estado = Estado.NORMAL;
	@Override
	public int getAtaque(int ataque) {
		return ataque;
	}

	@Override
	public int getDefensa(int defensa) {
		return defensa;
	}

	@Override
	public State calmar() {
		
		return new ModoMeditar();
	}

	@Override
	public State recibirDano(Vikingo v1, int dano) {
		if(v1.getSalud()*0.15 <= Math.abs(v1.getDefensa()-dano)) {
			return new ModoBerseker();
		}
		return this;
	}

	@Override
	public Estado getEstado() {
		return estado;
	}

}
