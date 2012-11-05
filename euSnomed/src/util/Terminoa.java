package util;

public class Terminoa {
	private String karKatea = "";
	private Analisia anlisi = null;
	
	
	public Terminoa(String karKatea, Analisia anlisi) {
		super();
		this.karKatea = karKatea;
		this.anlisi = anlisi;
	}
	
	public String getKarKatea() {
		return karKatea;
	}
	public void setKarKatea(String karKatea) {
		this.karKatea = karKatea;
	}
	public Analisia getAnlisi() {
		return anlisi;
	}
	public void setAnlisi(Analisia anlisi) {
		this.anlisi = anlisi;
	}
	
	
}
