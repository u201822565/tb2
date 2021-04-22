package model;

import java.io.Serializable;

@Entity
@NamedQuery ( name = "Administrador.findAll", query = " SELECT a FROM Administrador a")

public class Solicitud_Capacitador implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@id
	@GeneratedValue(Strategy=GenerationType.IDENTITY)
    private int cadministrador;
	
	public administrador(){
		
	}
	
	public int Nadministrador() {
		return this.Nadministrador();
	}
}