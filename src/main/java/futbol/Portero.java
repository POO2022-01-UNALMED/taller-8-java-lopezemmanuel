package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	
	public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
		super(nombre, edad, "Portero");
		this.dorsal=dorsal;
		this.golesRecibidos=golesRecibidos;
	}
	
	public String toString() {
		return "El futbolista "+ getNombre() + " tiene " + getEdad() + ", y juega de " + getPosicion() +
				" con el dorsal " + this.dorsal + ". Le han marcado "+ this.golesRecibidos;
	}

	@Override
	public int compareTo(Object futbolista) {
		Portero portero = (Portero) futbolista;
		return portero.getGolesRecibidos() - this.getGolesRecibidos();
	}

	@Override
	public boolean jugarConLasManos() {
		return true;
	}

	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}
}
