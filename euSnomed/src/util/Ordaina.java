package util;

public class Ordaina {

	private String karKatea = "";
	private Integer iturbura = 0;
	private String definizioa = "";
	
	public Ordaina(String karKatea, Integer iturbura, String definizioa) {
		super();
		this.karKatea = karKatea;
		this.iturbura = iturbura;
		this.definizioa = definizioa;
	}
	
	public String getKarKatea() {
		return karKatea;
	}
	public void setKarKatea(String karKatea) {
		this.karKatea = karKatea;
	}
	public Integer getIturbura() {
		return iturbura;
	}
	public void setIturbura(Integer iturbura) {
		this.iturbura = iturbura;
	}
	public String getDefinizioa() {
		return definizioa;
	}
	public void setDefinizioa(String definizioa) {
		this.definizioa = definizioa;
	}
}
