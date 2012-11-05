package util;

import java.util.HashMap;

public class PareZerrenda {

	private HashMap<String, Parea> pareak = null;
	private String jatorriHizkuntza = "";
	
	public PareZerrenda(HashMap<String, Parea> pareak, String jatorriHizkuntza) {
		super();
		this.pareak = pareak;
		this.jatorriHizkuntza = jatorriHizkuntza;
	}
	
	public void gehitu (String terminoa, Parea parea){
		if (this.pareak.containsKey(terminoa)){
			OrdainZerrenda oz = this.pareak.get(terminoa).getOrdainak();
			oz.elkartu(parea.getOrdainak());
		}else{
			pareak.put(terminoa, parea);
		}
	}
	
	public OrdainZerrenda ordainakJaso(String terminoa){
		return this.pareak.get(terminoa).getOrdainak();
	}
	
	
	public HashMap<String, Parea> getPareak() {
		return pareak;
	}
	public void setPareak(HashMap<String, Parea> pareak) {
		this.pareak = pareak;
	}
	public String getJatorriHizkuntza() {
		return jatorriHizkuntza;
	}
	public void setJatorriHizkuntza(String jatorriHizkuntza) {
		this.jatorriHizkuntza = jatorriHizkuntza;
	}
	
	
	
}
