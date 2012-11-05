package util;

public class Parea {
	
	private Terminoa jatorria = null;
	private OrdainZerrenda ordainak = null;
	
	
	public Parea(Terminoa jatorria, OrdainZerrenda ordainak) {
		super();
		this.jatorria = jatorria;
		this.ordainak = ordainak;
	}
	
	public Terminoa getJatorria() {
		return jatorria;
	}
	public void setJatorria(Terminoa jatorria) {
		this.jatorria = jatorria;
	}
	public OrdainZerrenda getOrdainak() {
		return ordainak;
	}
	public void setOrdainak(OrdainZerrenda ordainak) {
		this.ordainak = ordainak;
	}
	
	

}
