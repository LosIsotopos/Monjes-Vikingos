package paqueteVikingo;

public class Vikingo {
	private State state = new ModoNormal();
	private int ataque = 10;
	private int defensa = 10;
	private int salud = 100;
	
	
	public void recibirDano(int dano) {
		this.state = this.state.recibirDano(this, dano);
		
	}
	
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public int getAtaque() {
		return this.state.getAtaque(ataque);
	}
	public int getDefensa() {
		return this.state.getDefensa(defensa);
	}
	public int getSalud() {
		return salud;
	}

	public void calmar() {
		this.state = this.state.calmar();
		
	}
	
	public Estado getEstado() {
		return this.state.getEstado();
	}

	
	
}
