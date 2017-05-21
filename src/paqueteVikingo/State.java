package paqueteVikingo;

public interface State {
	public int getAtaque(int ataque);
	public int getDefensa(int defensa);
	public State calmar();
	public State recibirDano(Vikingo v1, int dano);
	public Estado getEstado();
}
