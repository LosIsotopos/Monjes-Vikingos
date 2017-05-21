package paqueteVikingo;

public class ModoMeditar implements State {
	Estado estado = Estado.MEDITAR;
	@Override
	public int getAtaque(int ataque) {

		return 1;
	}

	@Override
	public int getDefensa(int defensa) {

		return 5*defensa;
	}

	@Override
	public State calmar() {
		return this;
	}

	@Override
	public State recibirDano(Vikingo v1, int dano) {
		if(v1.getSalud()*0.05 <= Math.abs(v1.getDefensa()-dano)) {
			return new ModoNormal();
		}
		return this;
	}
	
	public Estado getEstado() {
		return estado;
	}



}
