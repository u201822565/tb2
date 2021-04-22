package model;

import java.io.Serializable;

@Entity
@NamedQuery ( name = " Capacitador.findAll", query = " SELECT a FROM Capacitador a")

public class Capacitador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@id
	@GeneratedValue(Strategy=GenerationType.IDENTITY)
	private int ccapacitador;
	
	public Capacitador() {
	}
	
	public int getcsolicitud() {
		return this.csolicitud;
	}
	public int getDfecha() {
		return this.getDfecha();
	}
	public int getqcantidad() {
		return this.getqcantidad();d
	}
	public int gethora() {
		return this.gethora();
	}
}